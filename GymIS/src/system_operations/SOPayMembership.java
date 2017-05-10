package system_operations;

import java.sql.SQLException;

import model.Model;

public class SOPayMembership {
	
	public static boolean execute(Model m, int id, String endDate) {
		if (SOFindMemberId.execute(m, id) == null )
			return false;
		try {
			m.payMembership(id, endDate);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
	}
}
