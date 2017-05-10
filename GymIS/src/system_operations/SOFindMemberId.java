package system_operations;

import java.sql.SQLException;

import domen.Member;
import model.Model;

public class SOFindMemberId {
	
	public static Member execute(Model m, int id) {
		try {
			return m.findMemberId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
