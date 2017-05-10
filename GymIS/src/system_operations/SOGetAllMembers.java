package system_operations;

import java.sql.SQLException;
import java.util.LinkedList;

import domen.Member;
import model.Model;

public class SOGetAllMembers {

	public static LinkedList<Member> execute(Model m){
		try {
			return m.getAllMembers();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
