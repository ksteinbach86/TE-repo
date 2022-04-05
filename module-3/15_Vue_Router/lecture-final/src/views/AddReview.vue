<template>
    <div>
        <h1>Add Review for {{ product.name }}</h1>
        <!-- <div class="actions">
            <router-link v-bind:to='//'>Go back! Abort! Get out of here!</router-link>
        </div> -->

        <add-review />

    </div>
</template>

<script>
import AddReview from '@/components/AddReview';

export default {
    components: {
        AddReview
    },
  computed: {
        product() {
            return this.$store.state.products.find((product) => {
                return product.id == this.$route.params.id
            });
        }
  }

}
</script>

<style>
</style>