use cinema;
insert into joue (film_id, acteur_id, `role`) 
values
 ((select id from film where titre="Titanic"),(select id from acteur where nom="DiCaprio" and prenom = "Leonardo"), "Jack Dawson" ),
 ((select id from film where titre="Titanic"), (select id from acteur where nom="WINSLET" and prenom = "KATE"), "Rose DeWitt Bukater" ),
 ((select id from film where titre="INCEPTION"), (select id from acteur where nom="DiCaprio" and prenom = "Leonardo"), "Dom Cobb" ),
 ((select id from film where titre="INCEPTION"), (select id from acteur where nom="Cotillard" and prenom = "Marion"), "Mall" ),
 ((select id from film where titre="INCEPTION"), (select id from acteur where nom="Page" and prenom = "Ellen"), "Ariane" ),
 ((select id from film where titre="THE DARK KNIGHT RISES"), (select id from acteur where nom="Bale" and prenom = "Christian"), "Bruce Wayne" ),
 ((select id from film where titre="THE DARK KNIGHT RISES"), (select id from acteur where nom="HATHAWAY" and prenom = "ANNE"), "Selina" ),
 ((select id from film where titre="THE DARK KNIGHT RISES"), (select id from acteur where nom="FREEMAN" and prenom = "MORGAN"), "Fox" ),
 ((select id from film where titre="THE DARK KNIGHT RISES"), (select id from acteur where nom="Cotillard" and prenom = "Marion"), "Miranda" ),
 ((select id from film where titre="LE MANS 66"), (select id from acteur where nom="Bale" and prenom = "Christian"), "Ken Miles" ),
 ((select id from film where titre="LE MANS 66"), (select id from acteur where nom="Damon" and prenom = "Matt"), "Carroll Shelby" ),
 ((select id from film where titre="LE MANS 66"), (select id from acteur where nom="Balfe" and prenom = "Caitriona"), "Mollie Miles" )
