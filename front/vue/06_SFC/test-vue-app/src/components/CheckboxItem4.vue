<script setup>
//composition
// defineProps
// 부모 컴포넌트에서 전달받은 프로퍼티를 정의하는 함수
// 4. 객체
defineProps({
  idol: {
    type: Object,
    required: true,
    // validator
    // vue 공식 기능
    // 부모가 prop을 전달할때마다 함수가 호출됨

    // typeof는 타입 반환
    validator: (value) => {
      return (
        (typeof value.id === 'number' || typeof value.id === 'string') &&
        typeof value.name === 'string' &&
        typeof value.checked === 'boolean'
      )
    },
  },
})
</script>

<template>
  <li><input type="checkbox" :checked="idol.checked" />{{ idol.name }}</li>
</template>

<style scoped></style>
