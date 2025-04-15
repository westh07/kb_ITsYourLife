<script setup>
import { useContactStores } from '@/stores/useContactStore'
import { onMounted, ref } from 'vue'
import { useRoute, useRouter } from 'vue-router'
const router = useRouter()
const route = useRoute()
const contactStores = useContactStores()

const contactId = ref(null)
const contact = ref([])
const isLoading = ref(true)
onMounted(async () => {
  contactId.value = route.params.id
  try {
    contact.value = await contactStores.getContactById(contactId.value)

    isLoading.value = false
  } catch (err) {
    alert('error 발생', err)
    isLoading.value = false
  } finally {
    isLoading.value = false
  }
})
const goList = () => {
  router.push('/contacts')
}
const goEdit = () => {
  router.push({ name: 'contacts/edit', params: { id: contact.value.id } })
}
const deleteContact = () => {
  const isDelete = confirm('진짜 삭제합니까?')
  if (isDelete) {
    contactStores.deleteContact(contact.value.id)
    goList()
  }
}
</script>

<template>
  <div class="app">
    <h2><i class="fa-solid fa-address-card"></i>연락처</h2>
    <div v-if="isLoading">loading...</div>
    <div class="first" v-else>
      <img :src="contact.photo" alt="" />
      <div class="second">
        <div class="three">
          <span>ID</span>
          <span>{{ contact.id }}</span>
        </div>
        <div class="three">
          <span>name</span>
          <span>{{ contact.name }}</span>
        </div>
        <div class="three">
          <span>tel</span>
          <span>{{ contact.tel }}</span>
        </div>
        <div class="three">
          <span>address</span>
          <span>{{ contact.address }}</span>
        </div>
        <div>
          <button @click="goList" type="button" class="btn btn-primary">
            <i class="fa-solid fa-list"></i>목록
          </button>
          <button @click="goEdit" type="button" class="btn btn-primary">
            <i class="fa-solid fa-pen-to-square"></i>수정
          </button>
          <button @click="deleteContact" type="button" class="btn btn-danger">
            <i class="fa-solid fa-trash-can"></i>삭제
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.app {
  margin: 1rem;
}
.first {
  display: flex;
}
.three > * {
  display: inline-block;
}
.three > *:first-child {
  width: 100px;
}
</style>
