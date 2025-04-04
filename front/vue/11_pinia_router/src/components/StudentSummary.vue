<script setup>
import { useStudentStore } from '@/stores/studentStore';
const studentStore = useStudentStore();
</script>

<template>
  <div>
    <p>
      전체 학생수:<strong>{{ studentStore.studentCount }}</strong>
    </p>
  </div>
</template>

<style scoped></style>
