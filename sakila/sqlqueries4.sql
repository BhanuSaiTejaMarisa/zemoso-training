select *
from customer_list cl
where country="Canada" and ID IN (select r.customer_id 
			 from rental r,
				  inventory i,
				  film_actor fa,
                  actor a
             where  r.inventory_id=i.inventory_id and
					i.film_id=fa.film_id and
                    fa.actor_id=a.actor_id and
                    a.first_name='NICK' and
                    a.last_name='WAHLBERG');

use sakila;
select distinct *
from customer_list cl
join rental r on r.customer_id = cl.ID
join inventory i on i.inventory_id=r.inventory_id
join film_actor fa on i.film_id=fa.film_id
join actor a on fa.actor_id=a.actor_id
where a.first_name='NICK' and
                    a.last_name='WAHLBERG' and cl.country="Canada"
