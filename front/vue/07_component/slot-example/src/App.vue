<script setup>
import Parent from './components/01_slot_basic/Parent.vue'
import Parent2 from './components/02_named_slot/Parent2.vue'
import Parent3 from './components/03_dynamic_slot/Parent3.vue'
import Parent4 from './components/04_scoped_slot/Parent4.vue'
</script>
<!-- 
slot
- 부모의 컴포넌트에서 자식으로 콘텐츠를 전달하는 기능
- 컴포넌트를 더 유연하고, 재사용 가능하게 만들기 위해 
 -->
<template>
  <div>app.vue</div>
  <Parent />
  <Parent2 />
  <Parent3 />
  <Parent4 />
</template>

<style scoped></style>
