<script setup></script>

<template>
  <div>
    <header>
      <slot name="header"></slot>
    </header>
    <body>
      <slot></slot>
    </body>
    <gooter>
      <slot name="footer"></slot>
    </gooter>
  </div>
</template>

<style scoped></style>
