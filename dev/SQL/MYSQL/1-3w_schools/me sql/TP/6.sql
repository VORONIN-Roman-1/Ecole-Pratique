use commerce;
SELECT ProductName, CategoryID, Unit, Price FROM products
where Price between 40 and 80 
order by price