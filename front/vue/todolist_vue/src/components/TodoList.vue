<script setup></script>

<template>
  <ul class="items">
    <!--  -->
  </ul>
</template>

<style scoped>
/* ul */
.items {
  padding: 1rem;
  height: 500px;
  overflow-y: auto;
}
/* li */
.item {
  display: flex;
  justify-content: space-between;
  gap: 1rem;
  padding: 0.5rem 1rem;
  border-bottom: 1px solid lightgray;
  cursor: pointer;
  transition: 0.3s;
}
.item:hover {
  background-color: #eae9ee;
}
/* li 체크 클릭됬을 때 */
.item.item_done span {
  opacity: 0.1;
  text-decoration: line-through;
}
.item span {
  flex: 1;
  /* text-align: left; */
}

/*  아이콘 */
.fa-check,
.fa-trash-can {
  font-size: 16px;
  transition: 0.3s;
}
.fa-check:hover {
  color: dodgerblue;
}
.fa-trash-can:hover {
  color: red;
  transform: scale(1.1);
}
</style>
