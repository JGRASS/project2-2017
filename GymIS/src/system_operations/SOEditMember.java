package system_operations;

import java.sql.Date;
import java.sql.SQLException;

import domen.Member;
import model.Model;

public class SOEditMember {

	public static void execute(Model m, int id, String firstName, String lastName, char gender, Date birthdate,
			String phoneNumber, Date endDate, double height, double weight) {

		Member tempMemb = new Member(firstName, lastName, gender, birthdate, phoneNumber, endDate,
				height, weight);
		
		tempMemb.setId(id);
		
		
		try {
			m.updateMember(tempMemb);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
