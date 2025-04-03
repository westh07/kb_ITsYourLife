<script setup></script>

<template>
  <footer class="footer">
    <input type="text" class="footer_input" />
    <div class="click-icon">
      <i class="fa-solid fa-plus"></i>
      <i class="fa-regular fa-calendar-days"></i>
      <div class="date_input">
        <label for="date">D-day 날짜</label> <br />
        <input type="date" class="date" />
      </div>
      <i class="fa-solid fa-circle-minus"></i>
    </div>
  </footer>
  <div class="delete_option">
    <div class="delete_check">체크된 것 삭제</div>
    <div class="delete_all">전체 삭제</div>
  </div>
</template>

<style scoped>
/* footer */
.footer {
  background: rgba(237, 193, 211);
  background: linear-gradient(
    166deg,
    rgba(237, 193, 211, 1) 0%,
    rgba(219, 192, 216, 1) 35%,
    rgba(127, 188, 242, 1) 100%
  );
  border-radius: 0 0 20px 20px;
}

.footer_input {
  width: 100%;
  border: none;
  outline: none;
  font-size: 1.5rem;
  padding: 1rem 1rem 1.25rem;
}
.click-icon {
  position: relative;
  display: flex;
  justify-content: center;
  width: 100%;
  height: 48px; /* 높이 설정 */
}
.fa-plus {
  display: absolute;
  left: 50%;
  transform: translateY(-10px);
  display: flex;
  justify-content: center;
  align-items: center;
  width: 48px;
  height: 48px;
  /* margin: auto; */
  font-size: 1.5rem;
  background-color: black;
  border-radius: 50%;
  color: white;
  transition: 0.3s;
  /* transform: translateY(-10px); */
  cursor: pointer;
}

.fa-plus:hover {
  transform: translateY(-15px) scale(1.1);
  /* scale만 쓰면 원래 것도 사라져서 작성해줘야함 */
}
.fa-calendar-days {
  position: absolute;
  right: 0;
  top: 50%;
  transform: translateY(-50%);
  display: flex;
  justify-content: center;
  align-items: center;
  width: 48px;
  height: 48px;
  /* margin: right; */
  font-size: 1.5rem;
  /* background-color: black; */
  /* border-radius: 50%; */
  color: white;
  transition: 0.3s;
  cursor: pointer;
}
.fa-calendar-days:hover {
  color: rgb(78, 78, 255);
}

.date_input {
  position: absolute;
  width: max-content;
  top: -62px;
  right: 0;
  margin: 0.5rem;
  padding: 5px;
  background-color: rgba(237, 193, 211, 50%);
  z-index: -10;
}

.date_input.active {
  position: absolute;
  width: max-content;
  top: -62px;
  text-align: center;
  right: 0;
  margin: 0.5rem;
  padding: 5px;
  background-color: rgba(237, 193, 211, 50%);
  z-index: 10;
}

.text_dDay {
  color: rgb(255, 73, 149);
}
.fa-circle-minus {
  position: absolute;
  left: 0;
  top: 50%;
  transform: translateY(-50%);
  display: flex;
  justify-content: center;
  align-items: center;
  width: 48px;
  height: 48px;
  font-size: 1.5rem;
  color: white;
  transition: 0.3s;
  cursor: pointer;
}
.fa-circle-minus:hover {
  color: rgb(255, 41, 41);
}
.delete_option {
  position: absolute;
  border: 2px solid lightgray;
  padding: 1rem;
  top: calc(50% - 75px);
  right: calc(50% - 92px);
  height: 150px;
  background-color: rgba(237, 193, 211, 50%);
  z-index: -10;
  /* width: 184px; */
  /* margin: auto; */
}
.delete_option div {
  border: 1px solid lightgray;
  padding: 1rem;
  width: 150px;
  cursor: pointer;
  background-color: white;
  text-align: center;
}
.delete_option div:hover {
  background-color: rgb(255, 41, 41, 50%);
  color: white;
}
.delete_option.active {
  position: absolute;
  border: 2px solid lightgray;
  padding: 1rem;
  top: calc(50% - 75px);
  right: calc(50% - 92px);
  height: 150px;
  background-color: rgba(237, 193, 211, 50%);
  z-index: 10;
  /* width: 184px; */
  /* margin: auto; */
}
</style>
