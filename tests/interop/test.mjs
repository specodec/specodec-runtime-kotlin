import { execSync } from 'child_process';
import { existsSync, mkdirSync, rmSync, readdirSync, writeFileSync, readFileSync } from 'fs';
import { join, dirname } from 'path';
import { fileURLToPath } from 'url';

const __dir = dirname(fileURLToPath(import.meta.url));
const CACHE = join(__dir, '.tests-cache');
const EMIT_GEN = join(__dir, 'emit_gen');
const OUT_DIR = join(__dir, 'output');

function run(cmd) {
  console.log('  >', cmd);
  execSync(cmd, { stdio: 'inherit' });
}

console.log('\n=== Step 1: Install dependencies ===');
run(`cd ${__dir} && npm install`);

console.log('\n=== Step 2: Using cached .tests-cache ===');

console.log('\n=== Step 3: Generate vectors ===');
run(`cd ${CACHE} && npm install`);
run(`cd ${CACHE} && node gen_types.mjs`);

const VEC_DIR = join(CACHE, 'vectors');

console.log('\n=== Step 4: Generate emit code ===');
if (existsSync(EMIT_GEN)) rmSync(EMIT_GEN, { recursive: true });
mkdirSync(EMIT_GEN, { recursive: true });

run(`cd ${__dir} && node_modules/.bin/tsp compile ${CACHE}/alltypes.tsp --emit=@specodec/typespec-emitter-kotlin \
  --option @specodec/typespec-emitter-kotlin.emitter-output-dir=${EMIT_GEN}`);

const ktFiles = readdirSync(EMIT_GEN).filter(f => f.endsWith('.kt'));
if (ktFiles.length > 0) {
  console.log(`  ✓ Generated ${ktFiles.join(', ')}`);
} else {
  console.error('  FAIL: No generated Kotlin files');
  process.exit(1);
}

console.log('\n=== Step 5: Generate test runner ===');
const srcDir = join(__dir, 'emit', 'src', 'main', 'kotlin');
if (!existsSync(srcDir)) mkdirSync(srcDir, { recursive: true });
run(`cd ${__dir} && VEC_DIR=${VEC_DIR} node generate_emit_runner.mjs`);

console.log('\n=== Step 6: Setup build.gradle.kts (local source) ===');
const buildGradle = `plugins {
    kotlin("jvm") version "2.3.21"
    application
}

group = "io.specodec"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":specodec-runtime-kotlin"))
}

application {
    mainClass.set("emit_kotlin.MainKt")
}

kotlin {
    jvmToolchain(25)
}

sourceSets {
    main {
        kotlin {
            srcDirs("src/main/kotlin", "../emit_gen")
        }
    }
}
`;
writeFileSync(join(__dir, 'emit', 'build.gradle.kts'), buildGradle);
writeFileSync(join(__dir, 'emit', 'settings.gradle.kts'), `rootProject.name = "emit_kotlin"
includeBuild("../../..")
`);
writeFileSync(join(__dir, 'emit', 'gradle.properties'), 'org.gradle.jvmargs=-Xmx8g -XX:MaxMetaspaceSize=1g\nkotlin.daemon.jvmargs=-Xmx8g');

console.log('\n=== Step 7: Run tests ===');
if (existsSync(OUT_DIR)) rmSync(OUT_DIR, { recursive: true });
mkdirSync(OUT_DIR, { recursive: true });

try { run(`cd ${__dir}/emit && gradle build`); } catch (e) { console.log("Kotlin build completed (some failures expected)"); }
try { run(`cd ${__dir}/emit && VEC_DIR=${VEC_DIR} OUT_DIR=${OUT_DIR} gradle run`); } catch (e) { console.log("Kotlin tests completed (some failures expected)"); }

console.log('\n=== Step 8: Compare output ===');
const manifest = JSON.parse(readFileSync(join(VEC_DIR, 'manifest.json'), 'utf-8'));
let match = 0, mismatch = 0;

for (const [name] of Object.entries(manifest.scalars || {})) {
  const expected = join(VEC_DIR, 'scalars', `${name}.mp`);
  const actual = join(OUT_DIR, 'scalars', `${name}.mp`);
  if (!existsSync(actual)) { mismatch++; console.log(`MISSING: ${name}.mp`); continue; }
  if (readFileSync(expected).equals(readFileSync(actual))) match++;
  else { mismatch++; console.log(`MISMATCH: ${name}.mp`); }
}
for (const model of manifest.testModels || []) {
  for (const [outExt, vecExt] of [['msgpack','msgpack'], ['json','json'], ['unformatted.json','json'], ['gron','gron']]) {
    const expected = join(VEC_DIR, `${model}.${vecExt}`);
    const actual = join(OUT_DIR, `${model}.${outExt}`);
    if (!existsSync(expected)) continue;
    if (!existsSync(actual)) { mismatch++; console.log(`MISSING: ${model}.${outExt}`); continue; }
    if (readFileSync(expected).equals(readFileSync(actual))) match++;
    else { mismatch++; console.log(`MISMATCH: ${model}.${outExt}`); }
  }
}
const total = match + mismatch;
console.log(`${match}/${total} match, ${mismatch} mismatch`);
if (mismatch > 0) process.exit(1);

console.log('\n=== ALL PASSED ===');