create schema if not exists notes;
use notes;
create table if not exists etudiant(
NEtudiant int(11) not null auto_increment,
Nom varChar(30) not null default 'Doe',
Prenom varChar(30) not null default 'John',
DateN date,
Groupe int(11),
primary key (NEtudiant)
) engine = InnoDB;
create table if not exists matiere(
CodeMat int(11) not null auto_increment,
LibelleMat varChar(30) not null,
CoeffMat int(11) not null default 1,
primary key (CodeMat)
) engine = InnoDB;
create table if not exists evaluer(
CodeMat int(11),
NEtudiant int(11),
DateE date,
Note decimal(2,1) not null,
primary key (NEtudiant, CodeMat),
constraint FK_NEtudiant
foreign key (NEtudiant) references etudiant(NEtudiant),
constraint FK_CodeMat
foreign key (CodeMat) references evaluer(CodeMat)
) engine = InnoDB;