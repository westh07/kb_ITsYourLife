<script setup>
import Child4 from './Child4.vue'
</script>
<!-- 
scoped slot
- 자식이 데이터를 넘겨준걸 이용해서 부모가 콘텐츠를 제공한다.
- 
-->
<template>
  <div style="border: 2px solid blue; padding: 10px">
    Parent4 :
    <Child4 v-slot:item="{ item }">
      <h3>{{ item.name }}</h3>
    </Child4>
  </div>
</template>

<style scoped></style>
