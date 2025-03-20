// let obj = { result: 0 };

//javascript의 this 바인딩 문제
//일반 함수는 호출될 때 this가 전역 객체를 참조함
// obj.add = function (x, y) {
//   function inner() {
//     this.result = x + y;
//   }
//   inner();
// };
// obj.add(3, 4);
// console.log(obj);
// console.log(obj.result); //0
// console.log(result); //7

// // 1. 화살표 함수
// // 화살표 함수는 this가 바로 위
// let obj = { result: 0 };
// obj.add = function (x, y) {
//   const inner = () => {
//     this.result = x + y;
//   };
//   inner();
// };
// obj.add(3, 4);
// console.log(obj);
// console.log(obj.result);

// 2. bind()
// 함수의 this 값을 특정 객체에 영구적으로 바인딩한 새로운 함수 변환
let obj = { result: 0 };
obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner.bind(this)();
};
obj.add(3, 4);
console.log(obj);
console.log(obj.result);
