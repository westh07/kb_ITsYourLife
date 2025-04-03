<script setup>
import { ref, watch } from 'vue';

const x = ref(0); // 0으로 초기화
const result = ref(''); // 0으로 초기화
// 필요한 경우 코드 추가
watch(x, (cur, old) => {
  result.value = `이전 값 : ${old} -> 새로운 값 : ${cur}`;
  console.log(result.value);
});
</script>

<template>
  <div>
    x : <input type="text" v-model.number="x" />
    <br />
    결과 : {{ result }}
  </div>
</template>
