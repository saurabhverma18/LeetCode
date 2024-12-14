select b.product_name, a.year, a.price
from sales as a
Join Product as b
ON a.product_id=b.product_id;