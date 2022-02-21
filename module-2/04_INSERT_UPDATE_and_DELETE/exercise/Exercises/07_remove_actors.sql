-- 7. Remove the actor appearances in "Avengers: Infinity War" (14 rows)
-- Note: Don't remove the actors themeselves, just make it so it seems no one appeared in the movie.
START TRANSACTION;
DELETE FROM movie;
SELECT COUNT(*)
FROM movie_actor


--movie_id 299536

ROLLBACK;


