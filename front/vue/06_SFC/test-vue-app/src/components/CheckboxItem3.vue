<script setup>
//composition
// defineProps
// 부모 컴포넌트에서 전달받은 프로퍼티를 정의하는 함수
// 2. 생성자 형식의 유효성 검사
defineProps({
  id: [Number, String], //문자열과 숫자형만 가능
  name: String, //문자열만 가능
  checked: {
    type: Boolean, //불리언 타입만 가능
    default: false, //기본값 설정
    required: false, //필수 조건인가? 기본값은 true
  },
})
</script>

<template>
  <li><input type="checkbox" :checked="checked" />{{ name }}</li>
</template>

<style scoped></style>
