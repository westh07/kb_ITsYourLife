<script setup>
import Child2 from './Child2.vue'
</script>

<template>
  <!-- 
  named slot
  - 부모가 자식 컴포넌트의 여러 위치에 콘텐츠 삽입 가능
  - slot에 name을 붙이면 특정 위치에 원하는 내용 전달 가능 
  -->
  <div style="border: 2px solid blue; padding: 10px">
    Parent2 :
    <Child2>
      <template #header>
        <p>header</p>
      </template>
      <template #default>
        <p>default</p>
      </template>
      <template #footer>
        <p>footer</p>
      </template>
    </Child2>
  </div>
</template>

<style scoped></style>
