<template>
  <main>
    <h2>Product Reviews for {{ name }}</h2>

    <p class="description">{{ description }}</p>

    <div class="well-display">
      <div class="well">
        <span class="amount">{{ averageRating }}</span>
        Average Rating
      </div>

      <div class="well">
        <span class="amount">{{ numberOfFiveStarReviews }}</span>
        5 Star Review{{ numberOfFiveStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ numberOfFourStarReviews }}</span>
        4 Star Review{{ numberOfFourStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ numberOfThreeStarReviews }}</span>
        3 Star Review{{ numberOfThreeStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ numberOfTwoStarReviews }}</span>
        2 Star Review{{ numberOfTwoStarReviews === 1 ? '' : 's' }}
      </div>
      <div class="well">
        <span class="amount">{{ numberOfOneStarReviews }}</span>
        1 Star Review{{ numberOfOneStarReviews === 1 ? '' : 's' }}
      </div>
    </div>

    <div
      class="review"
      v-bind:class="{ favorited: review.favorited }"
      v-for="review in reviews"
      v-bind:key="review.id"
    >
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

      <p>
        Favorite?
        <input type="checkbox" v-model="review.favorited" />
      </p>
    </div>
  </main>
</template>

<script>
        export default {
          name: "product-review",
          data() {
            return {
              name: "Un Lun Dun",
              description: "Un Lun Dun is a place where words are alive, a jungle lurks behind the door of an ordinary house, carnivorous giraffes stalk the streets, and a dark cloud dreams of burning the world. It is a city awaiting its hero.",
              reviews: [
                {
                  reviewer: "Phrynne",
                  title: "Great. A bit long",
                  review: "I always love China Miéville's imagination and the fantastic things he does with his worlds. In this book Un Lun Dun is a different kind of London containing places such as Webminster Abby (covered in webs and the home of a kind of spider). As with many young adult books (and this one is for the younger end of that category) the main characters are children who are smarter than the nasty grown ups who are out to get them. That was all good though and Reeba was a very smart, tough young lady.Not the author's best book but still very enjoyable and I bet he had an absolute ball writing it",
                  rating: 4,
                  favorited: false
                },
                {
                  reviewer: "Stephen",
                  title: "Double Facepalm",
                  review: "Let me begin this sadly negative review by saying that I think China Mieville is one of the BEST writers working today. To put it simply…he is THE MAN!! Unfortunately, and it pains me to say, he is THE MAN in this case that wrote a really shitty book. It happens to the best of artists at some point in their career. Al Pacino did \"Author, Author\", Steven Spielberg did \"Always\" and even Will Ferrell did \"Bewitched\". Well, this is Mr. Mieville’s \"Ishtar\", sans Dustin Hoffman and Warren Beatty.",
                  rating: 1,
                  favorited: false
                },
                {
                  reviewer: "Catie",
                  title: "A very enjoyable ride",
                  review: "Wow. How do I describe this book? It’s on the one hand a bit of an ode to all of the quest based, parallel world containing fantasies that have come before: The Wizard of Oz, Narnia, Mary Poppins, Alice in Wonderland, most of Neil Gaiman’s catalogue, hell even Harry Potter. On the other hand, it undermines the typical tenets of these books in a way that’s a bit of a fuck you to the whole genre. It also manages to transcend both of these things and become a decent quest based, parallel world containing fantasy itself. It’s fun, playful, and sometimes just downright silly. I wish that I could morph into Will Ferrell as James Lipton right now and declare it delightful. There are a few things that I could have done without, but for the most part I really enjoyed this book.",
                  rating: 4,
                  favorited: false
                },
                {
                  reviewer: "Susan",
                  title: "Derivative tosh",
                  review: "A poor man's Neverwhere. I'll admit that I stopped reading after 115 pages.",
                  rating: 2,
                  favorited: false
                },
                {
                  reviewer: "Amber",
                  title: "As if Hyao Miyazaki met Neil Gaiman in a bar",
                  review: "What do you get if you cross one of Hyao Miyazaki's animated films with Neil Gaiman's Neverwhere, the imagination of Clive Barker, and Alice in Wonderland? You get this book: Un Lun Dun by China Mieville. When young friends Zanna and Deeba follow a broken umbrella down to a sewer with a steering wheel, they turn it and enter the world of Un Lun Dun. Un Lun Dun (or UnLondon) is an urban wonderland where things that are thrown away in regular london are found and given a new purpose there. Upon entering the strange new land, Zanna and Deeba encounter a variety of strange creatures from an animated milk carton who acts like a puppy, ghosts, carnivorous giraffes, a man who when he speaks creates his own creatures, a flying british bus, garbage can ninjas, and a whole lot of other creatures who believe that Zanna is the one to save them from the dreaded smog. Can the friends save this new land from the smog? Read on to find out.",
                  rating: 5,
                  favorited: false
                },
                {
                  reviewer: "Arie",
                  title: "okay, but heavy-handed",
                  review: "My first introduction to Miéville's writing was Railsea. I had an almost instant reaction to it (confusion, frustration, amazement) that only grew stronger as the story progressed (and changed into shock, awe and adoration, and finished with the literary equivalent of being hit on the head with a shovel). Un Lun Dun disappointed me for the supremely unfair (on my behalf) reason that it didn't draw much of a reaction from me.",
                  rating: 3,
                  favorited: false
                },
                {
                  reviewer: "Frances",
                  title: "Just wow!",
                  review: "This was great! A gritty, Pratchetty, deceptive, in control Dorothy type fairy tale with a satisfying end. Only my second Miéville but I want to read everything he's written right now.",
                  rating: 5,
                  favorited: false
                }]
    };
  },
  computed: {
    averageRating() {
      let sum = this.reviews.reduce((currentSum, review) => {
        return currentSum + review.rating;
      }, 0);
      return (sum / this.reviews.length).toFixed(2);
    },
    numberOfOneStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 1);
      }, 0);
    },
    numberOfTwoStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 2);
      }, 0);
    },
    numberOfThreeStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 3);
      }, 0);
    },
    numberOfFourStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 4);
      }, 0);
    },
    numberOfFiveStarReviews() {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === 5);
      }, 0);
    }
  }
};
</script>

<style scoped>
main {
  margin: 1rem 0;
}

main div.well-display {
  display: flex;
  justify-content: space-around;
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
  border-radius: 6px;
  padding: 1rem;
  margin: 10px;
}

main div.review.favorited {
  background-image: linear-gradient(to right, lightyellow, hotpink);
}

main div.review div.rating {
  height: 2rem;
  display: inline-block;
  vertical-align: top;
  margin: 0 0.5rem;
}

main div.review div.rating img {
  height: 100%;
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

div.form-element {
  margin-top: 10px;
}
div.form-element > label {
  display: block;
}
div.form-element > input, div.form-element > select {
  height: 30px;
  width: 300px;
}
div.form-element > textarea {
  height: 60px;
  width: 300px;
}
form > input[type=button] {
  width: 100px;
}
form > input[type=submit] {
  width: 100px;
  margin-right: 10px;
}
</style>

