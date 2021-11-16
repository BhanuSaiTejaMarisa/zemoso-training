select count(f.film_id)
from film f,
	 film_actor fa,
     actor a
where a.first_name="SEAN" and
	  a.last_name="WILLIAMS" and
      a.actor_id=fa.actor_id and
      fa.film_id=f.film_id;
  
  
select count(f.film_id)
from film f  
join film_actor fa on fa.film_id=f.film_id
join actor a on fa.actor_id=a.actor_id 
  where a.first_name="SEAN" and
	  a.last_name="WILLIAMS"   
