use commerce;
SELECT products.* FROM products
JOIN categories ON products.CategoryID = categories.CategoryID
where categories.CategoryName= 'Confections' OR  categories.CategoryName= 'Grains/Cereals' ;