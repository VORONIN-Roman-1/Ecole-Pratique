use commerce;
SELECT count(*) FROM customers
where City = 'Marseille' OR City = 'Paris'  OR  City = 'Lyon';