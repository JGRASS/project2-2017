package system_operations;

import java.sql.SQLDataException;
import java.sql.SQLException;

import model.Model;

public class SOPayMembership {
	
	public static boolean execute(Model m, int id, String endDate) {
		if (SOFindMemberId.execute(m, id) == null )
			return false;
		try {
			m.payMembership(id, endDate);
			return true;
		} catch(SQLDataException e2) {
			return false;
		} catch (SQLException e) {
			return false;
		}
	}
}
