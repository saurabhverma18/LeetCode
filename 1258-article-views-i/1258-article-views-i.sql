# Write your MySQL query statement below
select Distinct author_id as id
from views
where author_id=viewer_id
Order by id ASC;