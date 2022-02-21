-- 4. Add a "Sports" genre to the genre table. Add the movie "Coach Carter" to the newly created genre. (1 row each)


--run this one first
INSERT INTO genre (genre_name)
VALUES ('Sports');

--run this second
INSERT INTO movie_genre (movie_id, genre_id)
VALUES (7214, 11771);

