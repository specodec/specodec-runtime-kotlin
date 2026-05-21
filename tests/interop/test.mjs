import { execSync } from 'child_process';
import { existsSync, mkdirSync, rmSync, readdirSync, writeFileSync, readFileSync } from 'fs';
import { join, dirname } from 'path';
import { fileURLToPath } from 'url';

const __dir = dirname(fileURLToPath(import.meta.url));
const VEC_DIR = join(__dir, "vectors");
const EMIT_GEN = join(__dir, 'emit_gen');
const OUT_DIR = join(__dir, 'output');

function run(cmd) {
  console.log('  >', cmd);
  execSync(cmd, { stdio: 'inherit' });
}

console.log('\n=== Step 1: Install dependencies ===');
run(`cd ${__dir} && npm install`);



console.log('\n=== Step 2: Generate emit code ===');
if (existsSync(EMIT_GEN)) rmSync(EMIT_GEN, { recursive: true });
mkdirSync(EMIT_GEN, { recursive: true });

run(`cd ${__dir} && node_modules/.bin/tsp compile ${__dir}/alltypes.tsp --emit=@specodec/typespec-emitter-kotlin \
  --option @specodec/typespec-emitter-kotlin.emitter-output-dir=${EMIT_GEN}`);

const ktFiles = readdirSync(EMIT_GEN).filter(f => f.endsWith('.kt'));
if (ktFiles.length > 0) {
  console.log(`  ✓ Generated ${ktFiles.join(', ')}`);
} else {
  console.error('  FAIL: No generated Kotlin files');
  process.exit(1);
}

console.log('\n=== Step 3: Generate test runner ===');
const srcDir = join(__dir, 'emit', 'src', 'main', 'kotlin');
if (!existsSync(srcDir)) mkdirSync(srcDir, { recursive: true });
run(`cd ${__dir} && VEC_DIR=${VEC_DIR} node generate_emit_runner.mjs`);

console.log('\n=== Step 4: Runtime setup ===');
const RUNTIME_SRC = join(__dir, '..', '..', 'src', 'commonMain', 'kotlin');
const EMIT_SRC = join(__dir, 'emit', 'src', 'main', 'kotlin');
const BUILD_DIR = join(__dir, 'emit', 'classes');
mkdirSync(EMIT_SRC, { recursive: true });
mkdirSync(BUILD_DIR, { recursive: true });

const KOTLIN_HOME = '/home/user/.local/share/mise/installs/kotlin/2.3.21/kotlinc';
const KSTDLIB = join(KOTLIN_HOME, 'lib', 'kotlin-stdlib.jar');
if (!existsSync(KSTDLIB)) { console.error('kotlin-stdlib not found at ' + KSTDLIB); process.exit(1); }

// Collect all Kotlin source files
const allKtFiles = [];
function collectKt(dir) {
  if (!existsSync(dir)) return;
  for (const f of readdirSync(dir, { recursive: true })) {
    if (f.endsWith('.kt')) allKtFiles.push(join(dir, f));
  }
}
collectKt(RUNTIME_SRC);
collectKt(EMIT_GEN);
collectKt(join(__dir, "emit"));
const args = allKtFiles.map(f => `"${f}"`).join(' ');
run(`kotlinc -d "${BUILD_DIR}" -classpath "${KSTDLIB}" ${args}`);

console.log('\n=== Step 5: Run tests ===');
if (existsSync(OUT_DIR)) rmSync(OUT_DIR, { recursive: true });
mkdirSync(OUT_DIR, { recursive: true });
try { run(`cd "${__dir}/emit" && VEC_DIR="${VEC_DIR}" OUT_DIR="${OUT_DIR}" java -cp "${BUILD_DIR}:${KSTDLIB}" emit_kotlin.MainKt`); } catch (e) { console.log("Kotlin tests completed (some failures expected)"); }

console.log('\n=== Step 6: Compare output ===');
const manifest = JSON.parse(readFileSync(join(VEC_DIR, 'manifest.json'), 'utf-8'));
let match = 0, mismatch = 0;

for (const [name] of Object.entries(manifest.scalars || {})) {
  const expected = join(VEC_DIR, 'scalars', `${name}.mp`);
  const actual = join(OUT_DIR, 'scalars', `${name}.mp`);
  if (!existsSync(actual)) { mismatch++; console.log(`MISSING: ${name}.mp`); continue; }
  if (readFileSync(expected).equals(readFileSync(actual))) match++;
  else { mismatch++; console.log(`MISMATCH: ${name}.mp`); }
}
for (const model of [...(manifest.testModels || []), ...(manifest.testUnions || [])]) {
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