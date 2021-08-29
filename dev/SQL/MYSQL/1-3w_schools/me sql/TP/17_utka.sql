use commerce;
select customers.CustomerName, customers.Country, orders.OrderID,nbOrders.nb as NumberOfOrders,total.summ as Total from customers
join 
	(select CustomerID,count(*) as nb from orders group by CustomerID having count(*)>=2) as nbOrders 
    on nbOrders.CustomerID=customers.CustomerID    
join 
	(select orders.CustomerID,sum(products.Price*orderdetails.Quantity) as summ from orders
		join orderdetails on orders.OrderID=orderdetails.OrderID
		join products on products.ProductID=orderdetails.ProductID
        group by orders.CustomerID
	) as total
	on total.CustomerID=customers.CustomerID    
join orders on customers.CustomerID = orders.CustomerID
order by customers.CustomerID;