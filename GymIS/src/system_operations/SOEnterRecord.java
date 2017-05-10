package system_operations;

import java.sql.SQLException;

import model.Model;

public class SOEnterRecord {
	public static boolean execute(Model m, int id) {
		try {
			m.enterRecord(id);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
