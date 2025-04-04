import { defineStore } from 'pinia';
import { computed, ref } from 'vue';

// pinia 스토어 정의
// defineStore : 스토어 생성하는 함수
// 첫번째인자가 스토어의 고유 ID가 된다.
export const useLikeStore = defineStore('like', () => {
  // state
  const like = ref(0); // 카운터 값을 **저장하는 상태 변수**

  // getter
  // 5배씩 보이는
  const fivetime = computed(() => like.value * 5);

  // action
  // 1씩 증가시키는 메서드
  const increase = () => {
    like.value++;
  };

  return { like, increase, fivetime };
});
