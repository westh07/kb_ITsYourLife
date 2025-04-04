import './assets/main.css';

import { createApp } from 'vue';
import { createPinia } from 'pinia'; // pinia
import App from './App.vue';

const app = createApp(App);

app.use(createPinia()); // pinia

app.mount('#app');
