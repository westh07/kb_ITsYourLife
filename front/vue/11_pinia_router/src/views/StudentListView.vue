<script setup>
import StudentList from '@/components/StudentList.vue';
import StudentSummary from '@/components/StudentSummary.vue';
</script>

<template>
  <div>
    <h3>학생목록</h3>
    <StudentList />
    <h3>학생수 summary</h3>
    <StudentSummary />
  </div>
</template>

<style scoped></style>
