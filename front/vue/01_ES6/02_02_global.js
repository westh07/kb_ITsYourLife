let msg = 'GLOBAL';
function outer() {
  let msg = 'OUTER';
  console.log(msg); //outer
  if (true) {
    let msg = 'BLOCK';
    console.log(msg); //block
  }
  console.log(msg); //outer
}
console.log(msg); //global
outer();
console.log(msg); //global
