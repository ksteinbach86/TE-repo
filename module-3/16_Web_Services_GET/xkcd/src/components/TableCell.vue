<template>
    <td><p v-if="isLoading">Loading...</p><p v-else>{{ comic.safe_title }}</p></td>


</template>

<script>
import comicService from '@/services/ComicService.js';

export default {
    name: "table-cell",
    data() {
        return {
            comic: {
                month: '',
                day: 0,
                year: 0,
                num: 0,
                safe_title: 'Nothing yet',
                img: '',
                alt: ''
            },
            isLoading: true
        };
    },
  created() {
    comicService
    .getComic(200)
    .then(response => {
        this.comic = response.data;
        this.isLoading = false
      })
      .catch(err => alert(err)) ;
  }
};

</script>

<style scoped>

</style>