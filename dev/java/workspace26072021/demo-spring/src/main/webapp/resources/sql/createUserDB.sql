CREATE USER 'testUser'@'localhost' IDENTIFIED BY 'tesrUser';
GRANT ALL PRIVILEGES ON * . * TO 'testUser'@'localhost';
ALTER USER 'testUser'@'localhost' IDENTIFIED WITH
mysql_native_password BY '12345';