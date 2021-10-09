CREATE USER 'roman'@'localhost' IDENTIFIED BY 'roman';
GRANT ALL PRIVILEGES ON * . * TO 'roman'@'localhost';
ALTER USER 'roman'@'localhost' IDENTIFIED WITH
mysql_native_password BY '12345';
