use sakila;



SELECT 
    COUNT(DISTINCT title)
FROM
    film
WHERE
    special_features LIKE '%Deleted Scenes%'
        AND film.film_id IN (SELECT 
            fc.film_id
        FROM
            category c,
            film_category fc
        WHERE
            c.name = 'Documentary'
                AND c.category_id = fc.category_id);




SELECT 
    COUNT(*)
FROM
    category c,
    film_category fc,
    inventory i,
    rental r,
    staff s
WHERE
    c.name = 'Sci-fi'
        AND c.category_id = fc.category_id
        AND fc.film_id = i.film_id
        AND i.inventory_id = r.inventory_id
        AND r.staff_id = s.staff_id
        AND s.first_name = 'Jon'
        AND s.last_name = 'Stephens';
        
        

        


SELECT 
    SUM(p.amount)
FROM
    film_list fl,
    inventory i,
    rental r,
    payment p
WHERE
    fl.category = 'Animation'
        AND fl.FID = i.film_id
        AND i.inventory_id = r.inventory_id
        AND r.rental_id = p.rental_id;




SELECT 
    fl.category, COUNT(  fl.category)
FROM
    film_list fl
WHERE
    fl.FID IN (SELECT 
            i.film_id
        FROM
            customer_list cl,
            rental r,
            inventory i
        WHERE
            cl.name = 'PATRICIA JOHNSON'
                AND cl.ID = r.customer_id
                AND r.inventory_id = i.inventory_id
        GROUP BY i.film_id)
GROUP BY fl.category
ORDER BY COUNT( fl.category) DESC 
LIMIT 3;



SELECT 
    fl.title
FROM
    film_list fl,
    inventory i,
    rental r,
    customer_list cl
WHERE
    fl.rating = 'R' AND fl.FID = i.film_id
        AND i.inventory_id = r.inventory_id
        AND r.customer_id = cl.ID
        AND cl.name = 'SUSAN WILSON';