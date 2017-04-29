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

	public void payMembership(int id, String date) throws SQLException { // date
																			// u
																			// formatu
																			// "yyyy-mm-dd"
		Connection con = connector.connect();
		String query = "UPDATE Members SET endDate=? WHERE id=?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, date);
		ps.setInt(2, id);

		ps.executeQuery();

		ps.close();
		con.close();
	}

}
