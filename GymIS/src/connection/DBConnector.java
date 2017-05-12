package connection;

import java.sql.*;
/**
 * Klasa koja omogucava konekciju sa relacionom bazom podataka.
 * 
 * @author Miljn Ignjatovic
 * @version 1.0
 */
public class DBConnector {
	/**
	 * Atribut predstaljva samu konekciju sa bazom.
	 */
	Connection con = null;

	String url = "jdbc:mysql://localhost:3306/GymIS";
	String user = "GymWorker";
	String pass = "pass123";

	/**
	 * Metoda vraca konekciju sa bazom.
	 * @return con 
	 * @throws java.sql.SQLException
	 */
	public Connection connect() throws SQLException {
		con = DriverManager.getConnection(url, user, pass);
		return con;
	}

}
