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
run(`cd ${__dir} && pnpm install`);

console.log('\n=== Step 2: Clone tests repo ===');
if (existsSync(CACHE)) rmSync(CACHE, { recursive: true });
run(`git clone --depth=1 https://github.com/specodec/tests ${CACHE}`);

console.log('\n=== Step 3: Generate vectors ===');
run(`cd ${CACHE} && pnpm install --frozen-lockfile`);
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
run(`cd ${__dir}/emit && VEC_DIR=${VEC_DIR} node generate_emit_runner.mjs`);

console.log('\n=== Step 6: Setup build.gradle.kts ===');
const getLatestCommit = execSync(`cd /home/ytr/Specodec/specodec-runtime-kotlin && git rev-parse HEAD`).toString().trim();

const buildGradle = `plugins {
    kotlin("jvm") version "2.3.21"
    application
}

group = "io.specodec"
version = "0.0.1"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("com.github.specodec:specodec-runtime-kotlin:${getLatestCommit}")
}

application {
    mainClass.set("emit_kotlin.MainKt")
}

kotlin {
    jvmToolchain(21)
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
writeFileSync(join(__dir, 'emit', 'settings.gradle.kts'), 'rootProject.name = "emit_kotlin"');

console.log('\n=== Step 7: Run tests ===');
if (existsSync(OUT_DIR)) rmSync(OUT_DIR, { recursive: true });
mkdirSync(OUT_DIR, { recursive: true });

run(`cd ${__dir}/emit && gradle build`);
run(`cd ${__dir}/emit && VEC_DIR=${VEC_DIR} OUT_DIR=${OUT_DIR} gradle run`);

console.log('\n=== ALL PASSED ===');