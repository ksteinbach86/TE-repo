<template>
    <div>
        <best-seller-list />
        <new-releases-list />
        <reading-list />

    </div>

</template>





<script>
import BestSellerList from '@/components/BestSellerList.vue';
import NewReleasesList from '@/components/NewReleasesList.vue';
import ReadingList from '@/components/ReadingList.vue';


export default{
    components: {
        BestSellerList,
        NewReleasesList,
        ReadingList
    },
}
</script>
