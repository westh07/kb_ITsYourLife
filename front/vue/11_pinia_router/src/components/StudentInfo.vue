<script setup>
defineProps({
  student: {
    type: Object,
    required: true,
  },
});
</script>

<template>
  <div class="student-info">
    <div>{{ student.name }}</div>
    <div>{{ student.email }}</div>
    <div>
      <a :href="student.githubURL" target="_blank">Github</a>
    </div>
  </div>
</template>

<style scoped></style>
