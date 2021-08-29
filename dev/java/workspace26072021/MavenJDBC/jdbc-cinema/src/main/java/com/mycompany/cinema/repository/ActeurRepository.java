package com.mycompany.cinema.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mycompany.cinema.dataProvider.mysqlProvider;
import com.mycompany.cinema.model.Acteur;

public class ActeurRepository {

	private Connection connection;

	public ActeurRepository() {

		this.connection = mysqlProvider.getConnection();

	}

	public List<Acteur> getAll() {
		List<Acteur> listActeur = new ArrayList<>();
		try {
			String sql = "SELECT id, nom, prenom FROM acteur";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet rst = statement.executeQuery();

			while (rst.next()) {

				String nom = rst.getString("nom");
				String prenom = rst.getString("prenom");
				Integer idActeur = rst.getInt("id");
				Acteur acteur = new Acteur(idActeur, nom, prenom);
				listActeur.add(acteur);
				System.out.println("Name: " + nom + " Prenom: " + prenom + " ID: " + idActeur);
			}

			rst.close();
			statement.close();
			System.out.println("===Fin===");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listActeur;
	}

	public Acteur getActeurByID(int id) {

		String sql = "Select id,nom, prenom FROM acteur WHERE id= ? ";
		try {
			PreparedStatement stm = connection.prepareStatement(sql);
			stm.setInt(1, id);
			ResultSet resultSet = stm.executeQuery();
			while (resultSet.next()) {
				String nom = resultSet.getString("nom");
				String prenom = resultSet.getString("prenom");
				Acteur acteur = new Acteur(id, nom, prenom);

				resultSet.close();
				stm.close();
				System.out.println("===Fin===");

				return acteur;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Acteur createActeur(Acteur acteur) {
		String sql = "INSERT INTO acteur (nom, prenom) VALUE (?,?)";
		try {
			PreparedStatement stm = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			stm.setString(1, acteur.getNom());
			stm.setString(2, acteur.getPrenom());

			int resultSetInsert = stm.executeUpdate();
			if (resultSetInsert > 0) {
				ResultSet resultSetID = stm.getGeneratedKeys();
				if (resultSetID.next()) {
					int idresultSetID = resultSetID.getInt(1);
					acteur.setId(idresultSetID);
				}

			}
			return acteur;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
