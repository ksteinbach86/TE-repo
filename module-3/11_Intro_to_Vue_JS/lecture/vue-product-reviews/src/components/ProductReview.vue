<template>
  <main>
    <h2>Product Review for {{ name }}</h2>
    <p class="description">{{ description }}</p>
    <div class="well-display">
      <div class="well">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
      </div>
      <div class="well">
        <span class="amount"><!-- data bind here --></span>
        1 Star Review
      </div>
      <div class="well">
        <span class="amount"><!-- data bind here --></span>
        2 Star Review
      </div>
      <div class="well">
        <span class="amount"><!-- data bind here --></span>
        3 Star Review
      </div>
      <div class="well">
        <span class="amount"><!-- data bind here --></span>
        4 Star Review
      </div>
      <div class="well">
        <span class="amount"><!-- data bind here --></span>
        5 Star Review
      </div>
    </div>

    <div class="review" v-for="review in reviews" v-bind:key="review.id">
      <h4>{{ review.reviewer }}</h4>

      <div class="rating">
        <img
          src="../assets/star.png"
          v-bind:title="review.rating + ' Star Review'"
          class="ratingStar"
          v-for="n in review.rating"
          v-bind:key="n"
        />
      </div>
      <h3>{{ review.title }}</h3>

      <p>{{ review.review }}</p>

      <p>Favorite? <input type="checkbox" v-model="review.favorited"/></p>

    </div>
  </main>
</template>


<script>
export default {
  name: "product-review",
  data() {
    return {
      name: "Cigar Parties for Dummies",
      description:
        "Host and plan the perfect party for all your squirrely friends.",
      reviews: [
        {
          reviewer: "Malcolm Gladwell",
          title: "What a book!",
          review: "It was a decent read...",
          rating: 3,
        },
        {
          reviewer: "Kevin Steinbach",
          title: "I really enjoyed this series! A++!",
          review: "I hold cigar parties annually now!",
          rating: 4,
        },
      ],
    };
  },
  computed: {
      averageRating() {
          let sum = this.reviews.reduce((currentSum, review) => {
              return currentSum + review.rating;
          }, 0);
          
          return sum / this.reviews.length;
      }

}

</script>


    <style scoped>
main {
  margin: 1rem 0;
}

main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

main div.review {
  border: 1px black solid;
  border-radius: 1px 36px 1px 36px;
  padding: 1rem;
  margin: 15px;
}

main div.review div.rating img {
  height: 100px;
}

main div.review p {
  margin: 20px;
}

main div.review h3 {
  display: inline-block;
}

main div.review h4 {
  font-size: 1rem;
}
</style>


