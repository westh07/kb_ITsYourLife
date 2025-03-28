<script setup>
import Child from './Child.vue'
</script>

<template>
  <div style="border: 2px solid blue; padding: 10px">
    parent :
    <Child><p>여기에 작성된 콘텐츠가 child로 전달됩니다</p> </Child>
  </div>
</template>

<style scoped></style>
