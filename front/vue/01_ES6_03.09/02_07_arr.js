//배열 구조 분해 할당
let arr = [10, 20, 30, 40];

//1. 기본적인 구조분해 할당
let [a1, a2, a3] = arr; //3개만 할당
console.log(a1, a2, a3);
//2. 일부 요소 건너 뛰기
let [, a4, a5, a6] = arr; //3개만 할당
console.log(a4, a5, a6);
//3. 기본값 설정
const zoo = ['panda', 'koala'];
const [an1, an2, an3 = 'monkey', an4 = 'dog'] = zoo;
console.log(an1, an2, an3, an4);
//4. 중첩된 배열 구조 분해
const nestedArray = [1, [2, 3], 4];
const [num1, [numArr1, numArr2], num2] = nestedArray;
console.log(num1, numArr1, numArr2, num2);
