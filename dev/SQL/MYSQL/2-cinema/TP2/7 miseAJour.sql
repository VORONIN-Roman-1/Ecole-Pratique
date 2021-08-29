use cinema;

-- film
update film
SET titre = upper(titre);

-- acteur
update acteur
SET nom = upper(nom),
   prenom = CONCAT(upper(SubString(prenom, 1, 1)), '', lower(Substring(prenom, 2, 255)));
   
-- réalisateurs
update realisateur
SET nom = upper(nom),
   prenom = CONCAT(upper(SubString(prenom, 1, 1)), '', lower(Substring(prenom, 2, 255)));
   
 -- salle   
 update salle
 set 
 nom = "Salle fantastique" where nom = "salle 1";
 
update salle
 set 
 nom = "Salle space opera" where nom = "salle 2";
 
update salle
 set 
 nom = "Salle médiévale" where nom = "salle 3";
 
update salle
 set 
 nom = "Salle obscure" where nom = "salle 4";
 
 -- Salle 1 séance de 19h15 en 20h00.
 update seance
 set seance.date_seance = DATE_FORMAT(seance.date_seance, '%Y-%m-%d 19:15:%s')
 where time(seance.date_seance) = "20:00:00" and  seance.salle_id = (select id from salle where nom="Salle fantastique") ;
 
 