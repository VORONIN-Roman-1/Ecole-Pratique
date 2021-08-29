CREATE SCHEMA IF NOT EXISTS `cinema` DEFAULT CHARACTER SET utf8mb4 ;

USE `cinema` ;

SET SQL_SAFE_UPDATES = 0;

TRUNCATE TABLE joue;
TRUNCATE TABLE seance;

DELETE FROM salle;
ALTER TABLE `salle`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

DELETE FROM acteur;
ALTER TABLE `acteur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;

DELETE FROM film;
ALTER TABLE `film`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
DELETE FROM realisateur;
ALTER TABLE `realisateur`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1;
  
SET SQL_SAFE_UPDATES = 1;

INSERT INTO acteur(prenom,nom) 
VALUES
("Leonardo", "DiCaprio"),
("KATE", "WINSLET"),
("Marion", "Cotillard" ),
("Ellen", "Page"),
("Christian", "Bale"),
("ANNE","HATHAWAY"),
("Christian", "Bale"),
("MORGAN", "FREEMAN"),
("Matt", "Damon"),
("Caitriona", "Balfe")
;

INSERT INTO realisateur(prenom,nom) 
VALUES
("JAMES", "CAMERON"),
("Christopher", "Nolan"),
("James", "Mangold" )
;

INSERT INTO film(titre,duree,realisateur_id) 
VALUES
("Titanic",(3*60+15),1),
("INCEPTION",(2*60+28),2),
("THE DARK KNIGHT RISES",(2*60+44),2),
("LE MANS 66",(2*60+33),3)
;

INSERT INTO joue(acteur_id, film_id, role) 
VALUES
(1,1,"Jack Dawson"),
(2,1,"Rose DeWitt Bukater"),
(1,2,"Dom Cobb"),
(3,2,"Mall"),
(4,2,"Ariane"),
(5,3,"Bruce Wayne"),
(6,3,"Selina"),
(7,3,"Fox"),
(3,3,"Miranda"),
(5,4,"Ken Miles"),
(8,4,"Carroll Shelby"),
(9,4,"Mollie Miles")
;

INSERT INTO salle(nom) 
VALUES
("Salle 1"),
("Salle 2"),
("Salle 3"),
("Salle 4")
;

INSERT INTO `seance` (`film_id`, `salle_id`, `date_seance`) 
VALUES 
('1', '1', '2020-08-10 09:00:00'),
('1', '1', '2020-08-10 12:30:00'),
('1', '1', '2020-08-10 15:45:00'),
('1', '1', '2020-08-10 19:15:00'),
('1', '1', '2020-08-10 21:00:00'),
('2', '2', '2020-08-10 09:00:00'),
('2', '2', '2020-08-10 11:45:00'),
('2', '2', '2020-08-10 14:30:00'),
('2', '2', '2020-08-10 17:15:00'),
('2', '2', '2020-08-10 20:00:00'),
('4', '3', '2020-08-10 09:00:00'),
('4', '3', '2020-08-10 11:45:00'),
('4', '3', '2020-08-10 14:30:00'),
('4', '3', '2020-08-10 17:15:00'),
('4', '3', '2020-08-10 20:00:00'),
('3', '4', '2020-08-10 09:00:00'),
('3', '4', '2020-08-10 12:00:00'),
('3', '4', '2020-08-10 15:00:00'),
('3', '4', '2020-08-10 18:00:00'),
('3', '4', '2020-08-10 21:00:00')
;

SET SQL_SAFE_UPDATES = 0;

UPDATE acteur 
SET 
nom = UPPER(nom), 
prenom = CONCAT(UPPER(SUBSTRING(prenom,1,1)),LOWER(SUBSTRING(prenom,2)))
;

UPDATE realisateur 
SET 
nom = UPPER(nom), 
prenom = CONCAT(UPPER(SUBSTRING(prenom,1,1)),LOWER(SUBSTRING(prenom,2)))
;

UPDATE film 
SET 
titre = UPPER(titre)
;

UPDATE salle
SET nom = "Salle fantastique"
WHERE id = 1;
UPDATE salle
SET nom = "Salle space opera"
WHERE id = 2;
UPDATE salle
SET nom = "Salle médiévale"
WHERE id = 3;
UPDATE salle
SET nom = "Salle obscure"
WHERE id = 4;

UPDATE seance
SET date_seance = '2020-08-10 20:00:00'
WHERE 
salle_id = 1 
AND date_seance = '2020-08-10 19:15:00'
;

SET SQL_SAFE_UPDATES = 1;
