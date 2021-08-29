use commerce;
-- la table additionnelle pour ajouter OrderID
select CustomerSum.*, orders.OrderID from 
		
		(select	customers.CustomerID, customers.CustomerName, customers.Country, 	
        sum(products.Price*orderdetails.Quantity) as Somme from 
				-- la table additionnelle avec une colonne CustomerID où clients ont 2 commandes minimum
				(SELECT orders.CustomerID , count(*) as counts FROM orders
				group by  orders.CustomerID
				having count(*)>1) as CustomersWith2_Orders
		join customers on customers.CustomerID = CustomersWith2_Orders.CustomerID
		join orders on orders.CustomerID =  customers.CustomerID
		join orderdetails on orders.OrderID =  orderdetails.OrderID
		join products on products.ProductID = orderdetails.ProductID
		group by orders.CustomerID) as CustomerSum
 join orders on orders.CustomerID =  CustomerSum.CustomerID
 order by orders.CustomerID