select f.title , count(r.rental_id) as cid
from film f, 
	inventory i,
    rental r,
    film_category fc,
    category c
where c.name="horror" and
	  f.film_id=fc.film_id and
	  f.film_id=i.film_id and
      fc.category_id=c.category_id and
      r.inventory_id=i.inventory_id
GROUP BY f.film_id 
order by count(r.rental_id) desc
limit 3;



