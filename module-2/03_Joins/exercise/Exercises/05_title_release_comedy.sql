-- 5. The titles and release dates of all the movies that are in the Comedy genre. Order the results by release date, earliest to latest. (220 rows)
SELECT title, release_date
FROM genre
JOIN movie_genre ON movie.movie_id = genre.genre.id
WHERE movie_genre = 'Comedy'
ORDER BY release_date DESC;

