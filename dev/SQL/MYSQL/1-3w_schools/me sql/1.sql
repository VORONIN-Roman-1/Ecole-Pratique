create  schema  if not exists notes;
use notes;

create table if not exists etudiant(
NEtudiant Int(11) not null auto_increment PRIMARY KEY,
nom varchar(30),
prenom varchar(30),
DateN date,
Groupe int(11) not null
) engine = InnoDB ;
create table if not exists matiere(
CodeMat Int(11) not null auto_increment PRIMARY KEY,
LibelleMat varchar(30),
CoeffMat int(11)
) engine = InnoDB;
create table if not exists evaluer(
NEtudiant Int(11),
CodeMat int(11),
DateE Date,
Note decimal(2,1),
CONSTRAINT evaluer_PK PRIMARY KEY(NEtudiant, CodeMat),
foreign key (NEtudiant) references etudiant (NEtudiant),
foreign key (CodeMat) references matiere (CodeMat)
) engine = InnoDB;
