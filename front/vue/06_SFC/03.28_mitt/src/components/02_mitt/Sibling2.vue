<script setup>
import { emitter } from '@/mitt'
import { ref, onMounted, onUnmounted } from 'vue'

const message = ref('메세지 없음(도착 전)')

function handleMessage(msg) {
  message.value = msg
}
// 컴포넌트가 마운트 되지 직전
onMounted(() => {
  // mitt 이벤트 리스너
  // send-message 이벤트 발생시 handleMessage 함수 실행
  emitter.on('send-message', handleMessage)
})
onUnmounted(() => {
  // 컴포넌트 제거시 이벤트 리스너도 제거
  emitter.off('send-message', handleMessage)
})
</script>

<template>
  <div>
    <h3>Sibling2</h3>
    <p>받은 메시지 : {{ message }}</p>
  </div>
</template>

<style scoped></style>
