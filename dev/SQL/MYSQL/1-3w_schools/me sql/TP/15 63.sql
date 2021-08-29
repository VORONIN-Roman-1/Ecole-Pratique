use commerce;
SELECT  orders.OrderID, 
		customers.CustomerName, customers.Country, 
        products.ProductName, products.Price, 
        employees.LastName, employees.FirstName 
FROM orders
join customers on customers.CustomerID= orders.CustomerID
join orderdetails on orderdetails.OrderID= orders.OrderID
join products on products.ProductID= orderdetails.ProductID
join employees on employees.EmployeeID= orders.EmployeeID
where orders.CustomerID=63
order by orders.OrderID


