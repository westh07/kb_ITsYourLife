<script setup>
import { ref } from 'vue'
import { useRouter } from 'vue-router'
import { useContactStores } from '@/stores/useContactStore'
const router = useRouter()
const contactStores = useContactStores()

const name = ref('')
const tel = ref('')
const address = ref('')
const photo = ref('')

const resetValue = async () => {
  const isReset = confirm('진짜 취소 하시겠습니까?')
  if (isReset) {
    name.value = ''
    tel.value = ''
    address.value = ''
    photo.value = ''
    router.push('/contacts')
  }
}
const addContact = async () => {
  const isAdd = confirm('진짜 추가 하시겠습니까?')
  if (isAdd) {
    if (!tel.value) {
      alert('전화번호를 입력해주세요')
      return
    }
    if (!name.value) {
      alert('이름을 입력해주세요')
      return
    }
    const timestamp = Date.now().toString()

    const newData = {
      no: timestamp,
      name: name.value,
      tel: tel.value,
      address: address.value,
      photo: photo.value,
      id: timestamp,
    }
    await contactStores.addContact(newData)
    router.push('/contacts')
  }
}
</script>

<template>
  <!-- <div>ContactWritePage.vue</div> -->
  <div class="app">
    <h2><i class="fa-solid fa-pen-to-square"></i>새연락처</h2>
    <div>
      <div class="mb-3 mt-3">
        <label for="name">name:</label>
        <input
          type="text"
          class="form-control"
          id="name"
          placeholder="이름을 입력하세요."
          name="name"
          v-model.trim="name"
        />
      </div>
      <div class="mb-3 mt-3">
        <label for="tel">tel:</label>
        <input
          type="text"
          class="form-control"
          id="tel"
          v-model.trim="tel"
          placeholder="전화번호를 입력하세요."
          name="tel"
        />
      </div>
      <div class="mb-3 mt-3">
        <label for="address">address:</label>
        <input
          type="text"
          class="form-control"
          id="address"
          v-model.trim="address"
          placeholder="주소을 입력하세요."
          name="address"
        />
      </div>
      <div class="mb-3 mt-3">
        <label for="photo">photo url:</label>
        <input
          type="text"
          class="form-control"
          id="photo"
          v-model.trim="photo"
          placeholder="사진의 url을 입력하세요."
          name="photo"
        />
      </div>
    </div>
    <div class="btns">
      <button @click="addContact" type="button" class="btn btn-primary">
        <i class="fa-solid fa-check"></i>확인
      </button>
      <button @click="resetValue" type="button" class="btn btn-primary">
        <i class="fa-solid fa-rotate-left"></i>취소
      </button>
    </div>
  </div>
</template>

<style scoped>
.app {
  margin: 1rem;
}
.btns {
  display: flex;
  justify-content: center;
}
.btns button {
  display: flex;
  margin: 0.1rem;
}
</style>
