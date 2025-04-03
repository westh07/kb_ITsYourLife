<script setup>
import { onMounted } from 'vue';
import { useStudent } from '@/api/Students';
import StudentCard from '@/components/SudentsCard.vue';
// 컴포저블 함수 사용 - 구조 분해 할당
const { students, error, fetchAllStudents } = useStudent();

onMounted(() => {
  fetchAllStudents();
});
</script>

<template>
  <div>
    <!-- 데이터 요청해서 가져옴 axios -->
    <h2>KB-19기 학생들</h2>
    <div>
      <div v-for="student in students" :key="student.id">
        <StudentCard :student="student" />
      </div>
    </div>
  </div>
</template>

<style scoped></style>
