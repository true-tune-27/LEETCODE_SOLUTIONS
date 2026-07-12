/* Write your PL/SQL query statement below */
/*\(a+b>c\)\(a+c>b\)\(b+c>a\)*/
SELECT x ,y ,z , 
CASE 
    WHEN(x+y > z) AND (y+z > x) AND (x+z > y) THEN 'Yes'
    ELSE 'No'
END AS triangle
FROM triangle;
