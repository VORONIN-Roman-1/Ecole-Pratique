use cinema;

-- Lister tous les films disponibles 
select * from film;

--  Lister tous les films du réalisateur Christopher Nolan ;
 select * from film
 where realisateur_id= (select id from realisateur where prenom= "Christopher" and nom= "Nolan" limit 1) ;
 
 -- Lister toutes les séances de la salle numéro 1 avec le film associé ;
 select * from seance
 where seance.salle_id = 1;
 
 -- Calculer le nombre de séance par jour par salle ;
 select count(*), seance.salle_id from seance
 group by seance.salle_id;
 
 -- Ajouter une nouvelle salle qui se nommera « évaluation » ;
insert salle(nom) values ("évaluation");

--  Changer le nom de la salle « évaluation » en « salle d’apprentissage » ;
update salle
set nom = "salle d’apprentissage" where nom= "évaluation";


-- Ajouter une séance à la salle d’apprentissage pour le 12/08/2020 à 9h00 avec le film INCEPTION ;
insert seance(film_id, salle_id, date_seance) values ((select id from film where titre= "INCEPTION" limit 1), (select id from salle where nom ="salle d’apprentissage" limit 1)  , "2020-08-12 09:00:00" );

-- Supprimer la salle d’apprentissage.
 alter table  `seance` 
DROP FOREIGN KEY `FK_salle_seance`;

alter table `seance`
add CONSTRAINT `FK_salle_seance` FOREIGN KEY (`salle_id`) REFERENCES `salle` (`id`) on delete cascade;

delete from salle where salle.nom="salle d’apprentissage";


-- ---------------------------------
select * from salle;
