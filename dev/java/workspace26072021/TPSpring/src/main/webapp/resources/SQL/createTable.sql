--
-- Table structure for table `utilisateur`
--
DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE `utilisateur` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `nom` varchar(45) DEFAULT NULL,
 `prenom` varchar(45) DEFAULT NULL,
 `email` varchar(45) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1