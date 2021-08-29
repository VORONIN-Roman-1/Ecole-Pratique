package com.mycompany.cinema.dataProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlProvider {
	private static Connection connection;
	private static String url = "jdbc:mysql://localhost:3307/cinema?useSSL=false&serverTimezone=Europe/Paris";
	private static String login = "root";
	private static String mdp = "";

	public static Connection getConnection() {
		if (connection == null) {
			try {
				mysqlProvider.connection = DriverManager.getConnection(mysqlProvider.url, mysqlProvider.login,
						mysqlProvider.mdp);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}
