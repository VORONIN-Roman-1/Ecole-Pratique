use cinema;
insert into film (realisateur_id, titre, duree) 
 values 
((select id from realisateur where nom="CAMERON" and prenom = "JAMES"), "Titanic", (3*60 + 14) ),
((select id from realisateur where nom="Nolan" and prenom = "Christopher"), "INCEPTION", (2*60 + 28) ),
((select id from realisateur where nom="Nolan" and prenom = "Christopher"), "THE DARK KNIGHT RISES", (2*60 + 44) ),
((select id from realisateur where nom="Mangold" and prenom = "James"), "LE MANS 66", (2*60 + 33) );

