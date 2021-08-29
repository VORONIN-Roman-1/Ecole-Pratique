use commerce;
SELECT DISTINCT customers.CustomerName, customers.Address  FROM customers
join  orders on orders.CustomerID =  customers.CustomerID
where  YEAR(orders.OrderDate) = 1997
order by customers.Country DESC