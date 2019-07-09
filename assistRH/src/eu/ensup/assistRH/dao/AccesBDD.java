package eu.ensup.assistRH.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesBDD {

	private String url = "jdbc:mysql://localhost/projetfilrouge";
	private String login = "root";
	private String passwd = "";

	public AccesBDD() {

	}

	public Statement seCoAlaBDD() {
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return st;
	}
}
