<template>
    <div id='app'>
      <header>
        <img src="./assets/logo.png" alt="Vue logo" />
      </header>

      <product-review></product-review>
    </div>
  
</template>

<script>
import ProductReview from './components/ProductReview.vue';
export default {
  name: 'app',
  components: {
    ProductReview
  }
};
</script>


<style>
#app {
  font-family: "Avenir", Helvetica, sans-serif;
  text-align: center;
  max-width: 800px;
  margin: 60px auto 0 auto;
}


</style>
