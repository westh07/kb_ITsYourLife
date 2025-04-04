import { defineStore } from 'pinia';
import { ref, computed } from 'vue';
import apiClient from '@/utils/axios'; //우리가 설치한 axios를 가져온것
export const useStudentStore = defineStore('studentStore', () => {
  // state
  const students = ref([]);

  // action - axios
  const fetchStudents = async () => {
    try {
      const response = await apiClient.get('/students');
      students.value = response.data;
      // 썬더 : put post 같은 api 요청 보내는 앱
    } catch (err) {
      console.log('학생정보 로딩 에러 : ', err);
    }
  };
  // getter : 한번만 호출됨
  const studentCount = computed(() => students.value.length);
  return { fetchStudents, students, studentCount };
});
