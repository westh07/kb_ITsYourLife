import ContactDetailPage from '@/views/ContactDetailPage.vue'
import ContactEditPage from '@/views/ContactEditPage.vue'
import ContactListPage from '@/views/ContactListPage.vue'
import ContactWritePage from '@/views/ContactWritePage.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      redirect: '/contacts',
    },
    {
      path: '/contacts',
      name: 'contacts',
      component: ContactListPage,
    },
    {
      path: '/contacts/detail/:id',
      name: 'contacts/detail',
      component: ContactDetailPage,
    },
    {
      path: '/contacts/write',
      name: 'contacts/write',
      component: ContactWritePage,
    },
    {
      path: '/contacts/edit/:id',
      name: 'contacts/edit',
      component: ContactEditPage,
    },
  ],
})

export default router
