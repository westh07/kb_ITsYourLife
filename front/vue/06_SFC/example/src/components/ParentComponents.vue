<script setup>
import ChildComponents from './ChildComponents.vue'
</script>

<template>
  <div style="border: 1px solid red; background-color: red">
    <h1>Parent 파일입니다</h1>
    <ChildComponents />
    <ChildComponents />
    <ChildComponents />
  </div>
</template>

<style scoped></style>
