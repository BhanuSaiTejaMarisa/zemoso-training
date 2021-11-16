use sakila;
SELECT 
    *
FROM
    customer_list
WHERE
    country = 'India'
        AND ID IN (SELECT 
            r.customer_id
        FROM
            film_list fl,
            inventory i,
            rental r
        WHERE
            fl.category = 'Sports'
                AND fl.FID = i.film_id
                AND r.inventory_id = i.inventory_id
        GROUP BY r.customer_id);
        
        
select * 
from customer_list
where country="india" and ID IN (select r.customer_id
			 from rental r,
                  inventory i,
                  film_category fc,
                  category c
             where r.inventory_id=i.inventory_id and
				   i.film_id=fc.film_id and 
                   fc.category_id=c.category_id and 
                   c.name="sports");
