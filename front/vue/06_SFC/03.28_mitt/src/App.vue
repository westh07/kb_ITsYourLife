<script setup>
import Sibling1 from './components/01_problem/Sibling1.vue'
import Sibling2 from './components/01_problem/Sibling2.vue'
import { ref } from 'vue'

const sibling2Message = ref('')
const handleMessageFromChild = (msg) => {
  sibling2Message.value = msg
}
</script>

<template>
  <h2>mitt 없이 형제 관계간 통신</h2>
  <Sibling1 @send-message="handleMessageFromChild" />
  <Sibling2 :message="sibling2Message" />
</template>

<style scoped></style>
