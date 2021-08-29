use commerce;
SELECT customers.CustomerName, customers.Address FROM customers
join orders on orders.CustomerID = customers.CustomerID
join shippers on orders.ShipperID = shippers.ShipperID
where shippers.ShipperName= 'United Package'; 