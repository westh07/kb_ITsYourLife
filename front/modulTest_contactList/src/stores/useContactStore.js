import { defineStore } from 'pinia'
import axios from 'axios'

const API_URL = '/api/contacts'

export const useContactStores = defineStore('contact', {
  state: () => ({
    contacts: [],
    isLoading: false,
    error: null,
  }),
  actions: {
    async fetchContacts() {
      this.isLoading = true
      try {
        const res = await axios.get(API_URL)
        this.contacts = res.data
        this.isLoading = false
      } catch (err) {
        alert('데이터 조회 실패', err)
        this.error = '데이터 조회 실패'
        this.isLoading = false
      } finally {
        this.isLoading = false
      }
    },
    async getContactById(id) {
      try {
        const res = await axios.get(`${API_URL}/${id}`)
        return res.data
      } catch (err) {
        alert(id, '의 데이터 조회 실패', err)
        this.error = id + '의 데이터 조회 실패'
      }
    },
    async deleteContact(id) {
      this.isLoading = true
      try {
        await axios.delete(`${API_URL}/${id}`)
        this.contacts = this.contacts.filter((con) => con.id !== id)
        this.isLoading = false
      } catch (err) {
        alert('데이터 삭제 실패', err)
        this.error = '데이터 삭제 실패'
        this.isLoading = false
      } finally {
        this.isLoading = false
      }
    },
    async addContact(newdata) {
      this.isLoading = true
      try {
        console.log('hi', newdata)
        const data1 = {
          ...newdata,
        }
        await axios.post(API_URL, data1)
        this.contacts.push(data1)
        this.isLoading = false
        return true
      } catch (err) {
        alert('데이터 추가 실패', err)
        this.error = '데이터 추가 실패'
        this.isLoading = false
      } finally {
        this.isLoading = false
      }
    },
    async updateContact(newdata) {
      this.isLoading = true
      try {
        console.log(newdata)
        const res = await axios.put(`${API_URL}/${newdata.id}`, newdata)
        let index = this.contacts.findIndex((con) => con.id === newdata.id)
        this.contacts[index] = res.data
        this.isLoading = false
        return true
      } catch (err) {
        alert('데이터 추가 실패', err)
        this.error = '데이터 추가 실패'
        this.isLoading = false
      } finally {
        this.isLoading = false
      }
    },
  },
})
