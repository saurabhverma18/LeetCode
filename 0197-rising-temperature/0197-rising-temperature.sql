# Write your MySQL query statement below
select a.Id
from
weather a
Join 
weather b
ON
a.recordDate=Date_add(b.recordDate, Interval 1 day)
where a.temperature>b.temperature;