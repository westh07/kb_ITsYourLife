<template>
  <div>
    <button @click="increase">좋아요 누르기</button>
  </div>
</template>

<script setup>
import { useLikeStore } from '@/stores/like';

const like = useLikeStore();
const { increase } = like;
</script>
