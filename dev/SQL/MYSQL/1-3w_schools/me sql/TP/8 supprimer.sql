use cinema;
delete from seance
where seance.salle_id = (select id from salle where salle.nom= "Salle fantastique") 
	and time(seance.date_seance) ="21:00:00";

ALTER TABLE `joue` 
DROP FOREIGN KEY `FK_film_joue`;
 
alter table `joue`
add CONSTRAINT `FK_film_joue` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`) on delete cascade;

ALTER TABLE `seance` 
DROP FOREIGN KEY `FK_film_seance`;
 
alter table `seance`
add CONSTRAINT `FK_film_seance` FOREIGN KEY (`film_id`) REFERENCES `film` (`id`) on delete cascade;
 
 
 delete from film
 where film.titre="Titanic";

