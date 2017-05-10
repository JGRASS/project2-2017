package system_operations;

import java.sql.SQLException;
import java.util.LinkedList;

import domen.Member;
import model.Model;

public class SOFindMembersLastName {
	public static LinkedList<Member> execute(Model m, String lastName) {
		
		try {
			return m.findMembersLastName(lastName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

}
