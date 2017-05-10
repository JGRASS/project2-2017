package system_operations;

import java.sql.SQLException;

import model.Model;

public class SOPayMembership {
	
	public static void execute(Model m, int id, String endDate) {
		try {
			m.payMembership(id, endDate);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
