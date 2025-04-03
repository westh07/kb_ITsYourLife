<script setup>
const props = defineProps(['id', 'checked', 'label']);

const emit = defineEmits('check-changed');
</script>
<template>
  <div>
    <input
      type="checkbox"
      :value="id"
      :checked="checked"
      @change="emit('check-changed', { id, checked: $event.target.checked })"
    />
    <!-- $event.target.checked : template 태그 안에서 이벤트 핸들러에서 가져왔을때 이름 앞에 $ 붙임 -->
    <span
      v-if="checked === true"
      style="color: blue; text-decoration: underline"
    >
      <i>{{ label }}</i>
    </span>
    <span v-else style="color: gray">{{ label }}</span>
  </div>
</template>
