WITH cte AS
(
    SELECT 
   d.name AS department,
   e.name AS employee,
   e.salary ,
   DENSE_RANK() OVER (PARTITION BY d.id ORDER BY e.salary DESC) as rnk
   FROM 
   employee e
   JOIN
   department d
   ON e.departmentid = d.id
)
SELECT department, employee,salary FROM cte WHERE rnk <= 3;