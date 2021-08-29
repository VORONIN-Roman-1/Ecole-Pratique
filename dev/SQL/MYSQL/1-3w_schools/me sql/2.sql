create  schema  if not exists analyse;
use analyse;

create table if not exists `client`(
codeclient varchar(30) PRIMARY KEY,
nom varchar(30) default "Anonyme",
cpclient varchar(30) not null,
villeclient varchar(30) not null,
rue varchar(30) not null,
tel varchar(30)
) engine = InnoDB ;
create table if not exists echantillon(
codeEchantillon Int(11) auto_increment PRIMARY KEY,
dateEntree date,
codeclient varchar(30),
foreign key (codeclient) references `client`(codeclient)
) engine = InnoDB;

create table if not exists typeanalyse(
RefTypeAnalyse varchar(30) PRIMARY KEY,
designation varchar(50),
TypeAnalyse varchar(50),
prixTypeAnaluse decimal(8,6)
) engine = InnoDB;

create table if not exists realiser(
codeEchantillon Int(11),
RefTypeAnalyse varchar(30),
dataRealisation date,
CONSTRAINT realiser_PK PRIMARY KEY(codeEchantillon, RefTypeAnalyse),
foreign key (codeEchantillon) references echantillon (codeEchantillon),
foreign key (RefTypeAnalyse) references typeanalyse (RefTypeAnalyse)
) engine = InnoDB;

ALTER TABLE `client`
DROP COLUMN rue;