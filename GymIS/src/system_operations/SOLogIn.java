package system_operations;

import java.sql.SQLException;

import model.Model;

public class SOLogIn {

	public static boolean execute(Model m, String username, String pass) {
		try {
			return m.logInGymWorker(username, pass);
		} catch (SQLException e) {
			return false;
		}
	}

}
