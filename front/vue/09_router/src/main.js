import './assets/main.css';
import 'bootstrap/dist/css/bootstrap.css';

import { createApp } from 'vue';
import App from './App.vue';
import router from './router'; // router

const app = createApp(App);

app.use(router); // router

app.mount('#app');
