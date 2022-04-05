<template>
    <div class='main'>
        <h1>{{ product.name }}</h1>
        <p class='description'>{{ product.description}}</p>
        <div class="actions">
            <router-link v-bind:to="{ name: 'add-review', params: { id: product.id }}">Add Review</router-link> 
            <router-link v-bind:to="{ name: 'products' }">Back to Products</router-link>
        </div>
        <div class="well-display">
            <average-summary />
            <star-summary rating="1" />
            <star-summary rating="2" />
            <star-summary rating="3" />
            <star-summary rating="4" />
            <star-summary rating="5" />
        </div>

        <review-list />

    </div>
</template>

<script>
import AverageSummary from '@/components/AverageSummary';
import ReviewList from '@/components/ReviewList.vue';
import StarSummary from '@/components/StarSummary.vue';

export default {
    name: 'product-detail',
    components: {
        AverageSummary,
        ReviewList,
        StarSummary
    },
    computed: {
        product() {
            return this.$store.state.products.find((product) => {
                return product.id == this.$store.state.activeProduct
            });
        }
    },
    created() {
        const activeProductId = this.$route.params.id;
        this.$store.commit("SET_ACTIVE_PRODUCT", activeProductId);
    }
    
}
</script>


<style scoped>

</style>