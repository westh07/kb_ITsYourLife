<script setup>
import { ref } from 'vue'
import InputName from './components/InputName.vue'
const parentName = ref('')
const nameChangeHandler = (event) => {
  parentName.value = event.childName
}
</script>

<template>
  <h1>App components</h1>
  <hr />
  <div>
    <InputName @nameChange="nameChangeHandler"></InputName>
    <h3>app data:{{ parentName }}</h3>
  </div>
</template>

<style scoped></style>
