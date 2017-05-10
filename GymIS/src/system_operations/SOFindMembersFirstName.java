package system_operations;

import java.sql.SQLException;
import java.util.LinkedList;

import domen.Member;
import model.Model;

public class SOFindMembersFirstName {
	public static LinkedList<Member> execute(Model m, String firstName) {
		
		try {
			return m.findMembersFirstName(firstName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
}
