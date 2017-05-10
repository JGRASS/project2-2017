package system_operations;

import java.sql.SQLException;

import model.Model;

public class SOEnterRecord {
	public static boolean execute(Model m, int id) {
		try {
			if(SOFindMemberId.execute(m, id) == null) {
				return false;
			}
			m.enterRecord(id);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
