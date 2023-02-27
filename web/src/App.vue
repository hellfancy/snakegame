<template>
  <Navbar></Navbar>
  <router-view></router-view>
</template>

<script>
import Navbar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
// import $ from 'jquery'

export default {
  components: {
    Navbar
  },
  setup() {
    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/token/",
    //   type: "post",
    //   data: {
    //     username: 'bb',
    //     password: "pbb",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });

    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/getinfo/",
    //   type: "get",
    //   headers: {
    //     Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJkYzZiY2ZjZmM4YTE0MTg3YjI4OTk3MzFjYTRmY2M3YSIsInN1YiI6IjIiLCJpc3MiOiJzZyIsImlhdCI6MTY3NzQ5Njc3MCwiZXhwIjoxNjc4NzA2MzcwfQ.KQCLJbaX1GP91d1BxwEEpHnu1FUHjSfTBzQG8MKnWFY"
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });

    // $.ajax({
    //   url: "http://127.0.0.1:3000/user/account/register/",
    //   type: "post",
    //   data: {
    //     username: 'yxc2',
    //     password: "123",
    //     comfirmedPassword: "123"
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });
  }
}
</script>

<style>
body {
  background-image: url("./assets/images/logo.png");
  background-size: cover;
}
</style>