/*
이름이 있는 내보내기
- 여러값을 내보낼 수 있다
- 반드시 기존 이름을 사용하거나 as를 통해 별칭을 부여*/
//export을 하면 다른 파일에서 import 가능
export const name = '홍길동';
export const age = 30;
export function greet() {
  return `hi ${name}~`;
}
