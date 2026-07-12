/* Write your PL/SQL query statement below */
SELECT score,
DENSE_RANK() over (ORDER BY score DESC ) AS rank
FROM Scores
WHERE id IS NOT NULL;