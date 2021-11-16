select title, film_id 
from film f
where rating="PG-13" and f.film_id IN (select film_id 
									from film_category
                                    where category_id IN (select category_id
														from category c
                                                        where name="comedy"));
                                                        
-- alternative 													
select f.title,f.film_id,f.rating,c.name
from film f,
	 category c,
     film_category fc
where f.rating="PG-13" and
	  f.film_id=fc.film_id and
      fc.category_id=c.category_id and
      c.name="comedy";
      
      -- you are audible