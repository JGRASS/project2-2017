package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;

import connection.DBConnector;
import domen.Member;
import domen.Timestamp;

public class Model {

	private static DBConnector connector = new DBConnector();

	public LinkedList<Member> getAllMembers() throws SQLException {
		LinkedList<Member> tempMembers = new LinkedList<Member>();
		Connection con = connector.connect();
		String query = "SELECT * FROM Members";

		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
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

	public void addNewMember(Member m) throws SQLException {
		Connection con = connector.connect();
		String query = "INSERT INTO "
				+ "Members(firstName, lastName, gender, birthdate, phoneNumber, endDate, height, weight)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, m.getFirstName());
		ps.setString(2, m.getLastName());
		ps.setString(3, String.valueOf(m.getGender()));
		ps.setDate(4, m.getBirthdate());
		ps.setString(5, m.getPhoneNumber());
		ps.setDate(6, m.getEndDate());
		ps.setDouble(7, m.getHeight());
		ps.setDouble(8, m.getWeight());

		ps.executeQuery();

		ps.close();
		con.close();
	}

	public void removeMember(int id) throws SQLException {
		Connection con = connector.connect();
		String query = "DELETE FROM Members WHERE id=?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeQuery();

		ps.close();
		con.close();

	}

	public Member findMemberId(int id) throws SQLException {
		Member m = new Member();
		Connection con = connector.connect();
		String query = "SELECT * FROM Members WHERE id=?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		int i = 0;
		rs.next();
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

		rs.close();
		ps.close();
		con.close();
		return m;
	}

	public LinkedList<Member> findMembersFirstName(String firstName) throws SQLException {
		LinkedList<Member> tempMemebers = new LinkedList<Member>();
		Connection con = connector.connect();
		String query = "SELECT * FROM Members WHERE firstName=?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, firstName);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
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

			tempMemebers.add(m);
		}

		rs.close();
		ps.close();
		con.close();
		return tempMemebers;

	}

	public LinkedList<Member> findMembersGender(char g) throws SQLException {
		LinkedList<Member> tempMembers = new LinkedList<Member>();
		Connection con = connector.connect();
		String query = "SELECT * FROM Members WHERE gender=?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, String.valueOf(g));
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
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

	public void payMembership(int id, String date) throws SQLException { // date u formatu "yyyy-mm-dd"
		Connection con = connector.connect();
		String query = "UPDATE Members SET endDate=? WHERE id=?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, date);
		ps.setInt(2, id);

		ps.executeQuery();

		ps.close();
		con.close();
	}

	/*
	First we use findMemberId, method returns object Member,
	and we fill all TxtFields in GUI with that data
	then we change attributes we want to change in that Member object
	then we use updateMember, method UPDATEs all column, nevermind they are changed or not
	*/
	
	public void updateMember(Member m) throws SQLException {
		Connection con = connector.connect();
		String query = "UPDATE Members SET "
				+ "firstName=?, lastName=?, gender=?, birthDate=?, phoneNumber=?, endDate=?, height=?, weight=?"
				+ " WHERE id=?";
		
		PreparedStatement ps = con.prepareStatement(query);
		int i = 0;
		ps.setString(++i, m.getFirstName());
		ps.setString(++i, m.getLastName());
		ps.setString(++i, String.valueOf(m.getGender()));
		
		if (m.getBirthdate() != null) 
			ps.setDate(++i, m.getEndDate());
		else 
			ps.setNull(++i, Types.DATE);
		
		
		if (m.getPhoneNumber() != null)
			ps.setString(++i, m.getPhoneNumber());
		else ps.setNull(++i, Types.VARCHAR);
		
		ps.setDate(++i, m.getEndDate());
		
		if (m.getHeight() != 0.0)
			ps.setDouble(++i, m.getHeight());//No need for if != null, default value of double is 0.0
		else ps.setNull(++i, Types.DOUBLE);
		
		if (m.getWeight() != 0.0) 
			ps.setDouble(++i, m.getWeight());
		else ps.setNull(++i, Types.DOUBLE);
		
		ps.setInt(++i, m.getId());
		
		ps.executeQuery();
		
		ps.close();
		con.close();

	}

	public void enterRecord(int id) throws SQLException {
		Connection con = connector.connect();
		String query = "INSERT INTO Evidence(membersID) VALUES (?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		
		ps.executeQuery();
		
		ps.close();
		con.close();
		
	}
	
	public boolean logInGymWorker(String username, String pass) throws SQLException {
		Connection con = connector.connect();
		String query = "SELECT id FROM GymWorkers WHERE username=? AND passwrd=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, pass);
		

		ResultSet rs = ps.executeQuery();
		rs.next();
		try{
			rs.getInt(1);
			return true;
		} catch (SQLDataException e) {
			return false;
		}
	}
	
	public LinkedList<Timestamp> getEvidenceOfMember(int memId) throws SQLException{
		LinkedList<Timestamp> tempLst = new LinkedList<Timestamp>();
		Connection con = connector.connect();
		String query = "SELECT id,timeStmp FROM Evidence WHERE membersId=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, memId);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){ 
			Timestamp tempTimeStamp = new Timestamp();
			
			tempTimeStamp.setId(rs.getInt(1));
			tempTimeStamp.setDate(rs.getDate(2));
			tempTimeStamp.setTime(rs.getTime(2));
			
			tempLst.add(tempTimeStamp);
		}
		
		rs.close();
		ps.close();
		con.close();
		return tempLst;
		
	}
	
}
