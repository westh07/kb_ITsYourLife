<script setup>
import { useContactStores } from '@/stores/useContactStore'
import { onMounted } from 'vue'
import { useRouter } from 'vue-router'
const router = useRouter()
const contactStores = useContactStores()
onMounted(() => {
  contactStores.fetchContacts()
})
const goDetail = (id) => {
  router.push({ name: 'contacts/detail', params: { id: id } })
}
const addContact = () => {
  router.push('/contacts/write')
}
</script>

<template>
  <!-- <div>contactListPage</div> -->
  <div class="app">
    <h2><i class="fa-solid fa-address-book"></i>연락처</h2>
    <div v-if="contactStores.isLoading">loading...</div>
    <div v-else-if="contactStores.error">{{ contactStores.error }}</div>
    <table v-else class="table">
      <thead>
        <tr>
          <th>id</th>
          <th>name</th>
          <th>tel</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="contact in contactStores.contacts" :key="contact.id">
          <td>{{ contact.id }}</td>
          <td class="people">
            <img :src="contact.photo" alt="" />
            <span @click="goDetail(contact.id)" class="name"> {{ contact.name }}</span>
          </td>
          <td>{{ contact.tel }}</td>
        </tr>
      </tbody>
    </table>
    <button @click="addContact" type="button" class="btn btn-primary">
      <i class="fa-solid fa-pen-to-square"></i>추가하기
    </button>
  </div>
</template>

<style scoped>
img {
  height: 2rem;
  width: 1.5rem;
  border-radius: 100%;
}
.people > * {
  margin-right: 0.5rem;
}
.name {
  cursor: pointer;
  color: blue;
  text-decoration: underline;
}
.btn {
  display: block;
  float: right;
}
.app {
  margin: 1rem;
}
</style>
