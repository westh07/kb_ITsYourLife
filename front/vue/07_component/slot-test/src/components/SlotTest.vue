<script setup>
import CheckBox2 from './CheckBox2.vue';

import { ref } from 'vue';

// 반응형 데이터 생성
const items = ref([
  { id: 'V', checked: true, label: 'Vue' },
  { id: 'A', checked: false, label: 'Angular' },
  { id: 'R', checked: false, label: 'React' },
  { id: 'S', checked: false, label: 'Svelte' },
]);

const CheckBoxChanged = (e) => {
  let item = items.value.find((item) => item.id === e.id);
  item.checked = e.checked;
  console.log('CheckBoxChanged 이벤트 핸들러 실행 ?', item.checked);
};
</script>
<template>
  <div>
    <h3>당신이 경험한 프론트 엔드 기술은?(두번째:Slot사용(0))</h3>
    <CheckBox2
      v-for="item in items"
      :key="item.id"
      :id="item.id"
      :checked="item.checked"
      @check-changed="CheckBoxChanged"
      ><span
        v-if="item.checked === true"
        style="color: blue; text-decoration: underline"
      >
        <i>{{ item.label }}</i>
      </span>
      <span v-else style="color: gray">{{ item.label }}</span>
    </CheckBox2>
  </div>
</template>
