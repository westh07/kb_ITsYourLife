<script setup>
import Counter from './components/Counter.vue';
import Like from './components/Like.vue';
import { useCounterStore } from './stores/counter';

const counter = useCounterStore();
const like = useLikeStore();
</script>
<!-- 
likeStore을 만들고 
like component에서 버튼으로 좋아요를 올려서 
App Component에서 바인딩해서 보이게 해보세요

//좋아요 뻥튀기 
getter 함수를 만들어서 좋아요 갯수 5배 뻥튀기하세요!
-->
<template>
  <div>
    <h1>pinia 상태 관리 예시</h1>
    <hr />
    <h2>좋아요 갯수 : {{ like.like }}</h2>
    <h2>좋아요 갯수 뻥튀기 : {{ like.fivetime }}</h2>
    <Like />
    <hr />
    <h2>App에서 보는 Counter: {{ counter.count }}</h2>
    <Counter />
  </div>
</template>

<style scoped></style>
