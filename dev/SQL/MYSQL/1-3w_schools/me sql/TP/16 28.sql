use commerce;
SELECT products.ProductName, products.Price, customers.CustomerName, customers.Country FROM products
join orderdetails on orderdetails.ProductID = products.ProductID
join orders on orderdetails.OrderID = orders.OrderID
join customers on customers.CustomerID = orders.CustomerID
 where products.ProductID=28 and orderdetails.Quantity between 15 and 30
 order by orderdetails.Quantity


