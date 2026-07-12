/* Write your PL/SQL query statement below */
select 
/*e1.id as emp_id*/
e1.name  as Employee
/*e2.id as manager_id,
e2.name as manager_name*/
from 
Employee e1
join
Employee e2
on e1.managerId = e2.id
where e1.salary > e2.salary;