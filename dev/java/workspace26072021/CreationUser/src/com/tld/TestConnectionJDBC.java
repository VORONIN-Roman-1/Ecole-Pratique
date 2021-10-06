package com.tld;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnectionJDBC {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/bdd_hibernate_demo?" + "useSSL=false&serverTimezone=UTC";
		String user = "padawan";
		String password = "padawan";
		try {
			System.out.println("Connecting to database " + jdbcUrl);
			Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection successfull!!");
			//connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
