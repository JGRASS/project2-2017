package system_operations;

import java.sql.Date;
import java.sql.SQLException;

import domen.Member;
import model.Model;

public class SOAddNewMember {
	
	public static boolean execute(Model m, String firstName, String lastName, char gender, Date birthdate,
			String phoneNumber, Date endDate, double height, double weight) {
		
		Member tempMemb = new Member(firstName, lastName, gender, birthdate, phoneNumber, endDate, height, weight);
		try {
			m.addNewMember(tempMemb);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
}
