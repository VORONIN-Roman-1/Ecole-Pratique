package com.tpSpring;

import java.sql.Connection;
import java.sql.DriverManager;

public class Application {
	public static void main(String[] args) {
		//String jdbcUrl = "jdbc:mysql://localhost:3306/bdd_hibernate_demo?" + "useSSL=false&serverTimezone=UTC";
		String jdbcUrl = "jdbc:mysql://localhost:3306/bdd_tp_spring?" + "useSSL=false&serverTimezone=UTC";
		String user = "roman";
		String password = "12345";
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
