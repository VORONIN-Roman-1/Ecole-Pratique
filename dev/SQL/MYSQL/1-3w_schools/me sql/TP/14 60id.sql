use commerce;
SELECT products.ProductName, products.Price, orderdetails.Quantity, orderdetails.OrderID FROM products
join orderdetails on orderdetails.ProductID= products.ProductID
where products.ProductID=60
order by orderdetails.Quantity DESC

