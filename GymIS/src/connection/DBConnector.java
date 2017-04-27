package connection;

import java.sql.*;

public class DBConnector {

	Connection con = null;

	String url = "jdbc:mysql://localhost:3306/GymIS";
	String user = "GymWorker";
	String pass = "pass123";

	public Connection connect() throws SQLException {
		con = DriverManager.getConnection(url, user, pass);
		return con;
	}

}
