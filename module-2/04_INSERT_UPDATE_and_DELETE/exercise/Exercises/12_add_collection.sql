-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)
UPDATE movie
SET collection_id = 1795482
WHERE movie_id = 399174;









SELECT *
FROM movie;
