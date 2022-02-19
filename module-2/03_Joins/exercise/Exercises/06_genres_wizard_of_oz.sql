-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT genre
FROM movie
JOIN movie_genre ON movie_genre.movie_id = collection.collection_id
WHERE movie_genre = 'The Wizard of Oz';

