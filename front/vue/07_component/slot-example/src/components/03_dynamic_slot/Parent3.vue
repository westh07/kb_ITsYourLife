<script setup>
import Child3 from './Child3.vue'
import { ref } from 'vue'
const slotName = ref('header')
const changeFooter = () => {
  slotName.value = 'footer'
}
const changeDefault = () => {
  slotName.value = 'default'
}
const changeHeader = () => {
  slotName.value = 'header'
}
</script>

<template>
  <!-- 
  dynamic slot
  - 부모가 자식 컴포넌트의 슬롯에 동적으로 콘텐츠 할당 가능
  (슬롯 이름을 동적으로 변경 가능)
  -->
  <div style="border: 2px solid blue; padding: 10px">
    Parent3 :
    <Child3 :slot-name="slotName">
      <template #header>
        <p>header</p>
      </template>
      <template #default>
        <p>default</p>
      </template>
      <template #footer>
        <p>footer</p>
      </template>
    </Child3>
  </div>
  <button @click="changeFooter">슬롯 이름 footer로 변경</button>
  <button @click="changeDefault">슬롯 이름 default로 변경</button>
  <button @click="changeHeader">슬롯 이름 header로 변경</button>
</template>

<style scoped></style>
