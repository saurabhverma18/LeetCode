# Write your MySQL query statement below
select 
unique_id,name
from
 employees as e
Left Join
 employeeuni as b
ON
 e.id=b.id;