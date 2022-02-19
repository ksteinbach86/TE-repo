-- 7. The genres of movies that Christopher Lloyd has appeared in (8 rows)
-- Hint: DISTINCT will prevent duplicate values in your query results.
SELECT DISTINCT movie_genre, person
FROM movie
JOIN movie_actor ON movie_actor.actor_id = person.person_id
JOIN genre ON movie.movie_id = genre.genre.id
WHERE actor_id = "Christopher Lloyd"
ORDER BY movie_genre;



