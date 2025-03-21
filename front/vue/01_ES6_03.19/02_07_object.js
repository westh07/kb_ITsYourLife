//객체 구조분해 할당
let user = { name: 'alice', age: 20, gender: 'M' };

//1. 객체 구조분해 할당
const { age, name } = user; //순서가 아닌 키값을 기준으로 할당됨 , 배열같은 경우는 인덱스 기준이라 순서가 중요
console.log(name, age);
//2. 변수 이름 변경 (별칭 지정)
const { name: userName, age: userAge } = user;
console.log(userName, userAge);
//3. 기본값 설정
const { salary = 5000, age: userAge1 = 30 } = user;
console.log(salary, userAge1);
//4. 중첩된 객체 구조 분해
const person = {
  name: 'bob',
  info: {
    address: 'seoul',
    hobbise: ['reading', 'coding'],
  },
};

// Q 구조분해 할당을 통해 이름과 첫번째 취미를 출력하시오
// const { name: name2, info:{address,hobbise} } = person;
const {
  name: name2,
  info: {
    address,
    hobbise: [firstHobby, secondHobby],
  },
} = person;
console.log(`name : ${name2}, 첫번째 취미 : ${firstHobby}`);
