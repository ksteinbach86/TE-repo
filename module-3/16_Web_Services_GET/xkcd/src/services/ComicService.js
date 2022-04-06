import axios from 'axios';

const http = axios.create({
  baseURL: "https://xkcd.com"
});

export default {

  getComic(comicID) {
    return http.get(`/${comicID}/info.0.json`)
  }


}
