use cinema;
insert into seance (film_id, salle_id, date_seance) 
values
 ((select id from film where titre="Titanic"), (select id from salle where nom="Salle 1"),  "2020-08-10 09:00:00" ),
 ((select id from film where titre="Titanic"), (select id from salle where nom="Salle 1"),  "2020-08-10 12:30:00" ),
 ((select id from film where titre="Titanic"), (select id from salle where nom="Salle 1"),  "2020-08-10 15:45:00" ),
 ((select id from film where titre="Titanic"), (select id from salle where nom="Salle 1"),  "2020-08-10 19:15:00" ),
 ((select id from film where titre="Titanic"), (select id from salle where nom="Salle 1"),  "2020-08-10 21:00:00" ),
 
 ((select id from film where titre="Inception"), (select id from salle where nom="Salle 2"),  "2020-08-10 09:00:00" ),
 ((select id from film where titre="Inception"), (select id from salle where nom="Salle 2"),  "2020-08-10 11:45:00" ),
 ((select id from film where titre="Inception"), (select id from salle where nom="Salle 2"),  "2020-08-10 14:30:00" ),
 ((select id from film where titre="Inception"), (select id from salle where nom="Salle 2"),  "2020-08-10 17:15:00" ),
 ((select id from film where titre="Inception"), (select id from salle where nom="Salle 2"),  "2020-08-10 20:00:00" ),
  
 ((select id from film where titre="Le Mans 66"), (select id from salle where nom="Salle 3"),  "2020-08-10 09:00:00" ),
 ((select id from film where titre="Le Mans 66"), (select id from salle where nom="Salle 3"),  "2020-08-10 11:45:00" ),
 ((select id from film where titre="Le Mans 66"), (select id from salle where nom="Salle 3"),  "2020-08-10 14:30:00" ),
 ((select id from film where titre="Le Mans 66"), (select id from salle where nom="Salle 3"),  "2020-08-10 17:15:00" ),
 ((select id from film where titre="Le Mans 66"), (select id from salle where nom="Salle 3"),  "2020-08-10 20:00:00" ),
 
 ((select id from film where titre="The Dark Knight Rises"), (select id from salle where nom="Salle 4"),  "2020-08-10 09:00:00" ),
 ((select id from film where titre="The Dark Knight Rises"), (select id from salle where nom="Salle 4"),  "2020-08-10 12:00:00" ),
 ((select id from film where titre="The Dark Knight Rises"), (select id from salle where nom="Salle 4"),  "2020-08-10 15:00:00" ),
 ((select id from film where titre="The Dark Knight Rises"), (select id from salle where nom="Salle 4"),  "2020-08-10 18:00:00" ),
 ((select id from film where titre="The Dark Knight Rises"), (select id from salle where nom="Salle 4"),  "2020-08-10 21:00:00" )

