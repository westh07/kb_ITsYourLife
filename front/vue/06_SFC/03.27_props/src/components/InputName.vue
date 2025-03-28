<script setup>
import { ref } from 'vue'
const emit = defineEmits(['nameChange'])
const childName = ref('')
</script>

<template>
  <div>
    name : <input type="text" v-model="childName" />
    <button @click="emit('nameChange', { childName })">event 발신</button>
  </div>
</template>

<style scoped></style>
