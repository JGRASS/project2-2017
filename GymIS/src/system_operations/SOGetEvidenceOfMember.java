package system_operations;

import java.sql.SQLException;
import java.util.LinkedList;

import domen.Timestamp;
import model.Model;

public class SOGetEvidenceOfMember {
	
	public static LinkedList<Timestamp> execute(Model m, int id) {
		
		try {
			return m.getEvidenceOfMember(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
}
