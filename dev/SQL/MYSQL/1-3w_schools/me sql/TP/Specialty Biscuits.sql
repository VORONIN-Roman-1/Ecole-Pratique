use commerce;
SELECT products.* FROM products
join suppliers on suppliers.SupplierID = products.SupplierID
where products.Price<10 and suppliers.SupplierName = 'Specialty Biscuits, Ltd.'
order by products.ProductName



