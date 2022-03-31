<template>
  <div class="hello">
    The message passed in will show up below through one way data binding<br />
    <h1>{{ msg }}</h1>

    <table border="1" width=800>
      <tr>
        <table-cell text="Something" />
        <table-cell text="Something else" />
        <table-cell text="Other Stuff" />
      </tr>
      <tr>
        <table-cell v-for="c in columns" v-bind:key="c" v-bind:text="c" />
      </tr>
            <tr>
        <td v-for="c in columns" v-bind:key="c">{{ c }}</td>
      </tr>
    </table>




  </div>
</template>

<script>
import TableCell from './TableCell.vue';

export default {
  name: 'HelloWorld',
  data() {
    return {
      columns: 3
    }
  },
  props: ["msg"],       // Props are HTML attributes passed in when we create the component
  components: {
    TableCell
  }
}
</script>








<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
