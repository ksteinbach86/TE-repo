<template>
  <div class="card">
    <h2 class="book-title">{{book.title}}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' 
    + book.isbn + '-M.jpg'" />

    <h3 class="book-author">{{book.author}}</h3>
    <div id="read">
        <label for="read"> Read</label>
        <input type="button" id="read" class=".mark-read" v-on:click="counter += 1" />


        <!-- <label for="unread"> Unread</label>
        <input type="unread" id="unread" class=".mark-unread" v-on:click="counter -= 1" /> -->
    </div>

    <!-- <form v-on:submit.prevent="addNewBook" v-if="showForm === true">
      <div class="form-element">
        <label for="title">Name:</label>
        <input id="title" type="text" v-model="newBook.title-input" />
      </div>
      <div class="form-element">
        <label for="author">Title:</label>
        <input id="author" type="text" v-model="newBook.author-input" />
      </div>
      <div class="form-element">
        <label for="isbn">Title:</label>
        <input id="isbn" type="text" v-model="newIsbn.isbn-input" />
      </div>
  </div> -->
</template>

<script>
export default {
    name: 'book-card',
    props: ['book'],
    methods: {
        readStatus() {
            return this.$store.commit('READ_STATUS');
        }
    }
    
}

</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>