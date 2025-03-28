<script setup>
const emit = defineEmits(['send-message'])
function sendMessage() {
  emit('send-message', 'hi Sibling2!! I am Sibling1~~')
}
</script>

<template>
  <div style="border: 1px solid blue">
    <h3>Sibling1</h3>
    <button @click="sendMessage">Sigling2에게 메시지 보내기</button>
  </div>
</template>

<style scoped></style>
