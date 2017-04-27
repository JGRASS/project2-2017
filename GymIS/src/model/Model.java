package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import connection.DBConnector;
import domen.Member;

public class Model {

	private static DBConnector connector = new DBConnector();
	
	public LinkedList<Member> getAllMembers() throws SQLException {
		LinkedList<Member> tempMembers = new LinkedList<Member>();
		Connection con = connector.connect();
		String query = "SELECT * FROM Members";
		
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Member m = new Member();
			int i = 0;
			m.setId(rs.getInt(++i));
			m.setFirstName(rs.getString(++i));
			m.setLastName(rs.getString(++i));
			m.setGender(rs.getString(++i).charAt(0));
			m.setBirthdate(rs.getDate(++i));
			m.setPhoneNumber(rs.getString(++i));
			m.setStartDate(rs.getDate(++i));
			m.setEndDate(rs.getDate(++i));
			m.setHeight(rs.getDouble(++i));
			m.setWeight(rs.getDouble(++i));
			
			tempMembers.add(m);
		}
		rs.close();
		ps.close();
		con.close();
		return tempMembers;
	}
	
}
