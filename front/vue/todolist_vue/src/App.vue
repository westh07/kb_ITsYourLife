<script setup>
import MainFooter from './components/MainFooter.vue'
import MainHeader from './components/MainHeader.vue'
import TodoList from './components/TodoList.vue'

function handleAddTodo() {}
</script>

<template>
  <section class="container">
    <MainHeader />
    <!-- filter -->
    <TodoList />
    <MainFooter @add-todo="handleAddTodo" />
  </section>
</template>

<style scoped></style>
