package com.mycompany.cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mycompany.cinema.model.Acteur;
import com.mycompany.cinema.repository.ActeurRepository;

/**
 * Exemple avec le model Entity / Repository.
 */
public class App 
{ 
    /**
     * Point d'entrée du programme en java.
     * 
     * @param args
     */
    public static void main( String[] args )
    {
        //code voir énoncé de l'évaluation
    	try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Connection succesfull!");
        }
        catch(Exception ex){
            System.out.println("Connection failed...");
             
            System.out.println(ex);
        }
    	String url ="jdbc:mysql://localhost:3307/cinema?useSSL=false&serverTimezone=Europe/Paris";
    	String login = "root";
    	String mdp ="";
    	Connection connection = null;
    	try {
    		
			connection = DriverManager.getConnection(url, login, mdp);
			
			ActeurRepository acteurRepository = new ActeurRepository();
			
			List<Acteur> listActeur = acteurRepository.getAll();
			
			for(Acteur acteur : listActeur) {
				
				System.out.println(acteur);

			}
			Acteur newActeur= new Acteur();
			newActeur.setNom("Vor");
			newActeur.setPrenom("Rom");
			
			Acteur acteurBDD= acteurRepository.createActeur(newActeur);
			System.out.println(acteurBDD);
			
			Acteur testActeur = acteurRepository.getActeurByID(acteurBDD.getId());
			System.out.println(testActeur);
			
		/*	int idNewActeurInsert=0;
			String insertSql = "INSERT INTO `acteur`(`prenom`, `nom`) VALUES (?, ?)";
			PreparedStatement statementInsert = connection.prepareStatement(insertSql, PreparedStatement.RETURN_GENERATED_KEYS);
			String prenomInsert= "Tom";
			String nomInsert= "Hardy";
			statementInsert.setString(1, prenomInsert);
			statementInsert.setString(2, nomInsert);
			int rstInsert = statementInsert.executeUpdate();
			
			if (rstInsert>0) {
				System.out.println("L'insert a réussi");
				ResultSet rerultSetInsert = statementInsert.getGeneratedKeys();
				
				if (rerultSetInsert.next()) {
					idNewActeurInsert =  rerultSetInsert.getInt(1);
				}
				System.out.println("Name: "+ nomInsert +" Prenom: "+ prenomInsert +" ID: "+ idNewActeurInsert);
			} else {
				System.out.println("L'insert a échoué");
			}
			
			
			String updateSql ="UPDATE acteur SET prenom=? where id=?";
			PreparedStatement statementUpdate= connection.prepareStatement(updateSql);
			String prenomUpdate= "Tomy";
			int idUpdate= idNewActeurInsert;
			statementUpdate.setString(1, prenomUpdate);
			statementUpdate.setInt(2, idUpdate);
			int rstUpdate= statementUpdate.executeUpdate();
			if (rstUpdate>0) {
				System.out.println("update a réussi");
				
				System.out.println(" Prenom: "+ prenomUpdate +" ID: "+ idNewActeurInsert);
			} else {
				System.out.println("update a échoué");
			}
			
			String deleteSql ="DELETE FROM acteur where id=?";
			PreparedStatement statementDelete= connection.prepareStatement(deleteSql);
			int idDelete= idNewActeurInsert;
			statementDelete.setInt(1, idDelete);
			int rstDelete= statementDelete.executeUpdate();
			if (rstDelete>0) {
				System.out.println("delete a réussi");
				
				System.out.println(" ID: "+ idNewActeurInsert);
			} else {
				System.out.println("delete a échoué");
			}
			//String deleteSql = "Delete FROM `acteur` WHERE ID=?";
			//PreparedStatement statement 
			
			
 			rst.close();
 			statement.close();
 			System.out.println("===Fin===");
 			*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
