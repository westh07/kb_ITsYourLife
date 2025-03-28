<script setup>
defineProps({
  message: String,
})
</script>

<template>
  <div>
    <h3>Sibling2</h3>
    <p>받은 메시지 : {{ message }}</p>
  </div>
</template>

<style scoped></style>
