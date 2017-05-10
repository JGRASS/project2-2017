package controller;

import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedList;

import domen.Member;
import model.Model;
import system_operations.SOAddNewMember;
import system_operations.SOEditMember;
import system_operations.SOEnterRecord;
import system_operations.SOFindMemberId;
import system_operations.SOFindMembersFirstName;
import system_operations.SOFindMembersLastName;
import system_operations.SOGetAllMembers;
import system_operations.SOLogIn;
import system_operations.SORemoveMember;

public class Controller {
	private static Model model = new Model();
	
	
	public static boolean logIn(String username, String pass) {
		return SOLogIn.execute(model, username, pass);
	}


	public static LinkedList<Member> getAllMembers() {
		return SOGetAllMembers.execute(model);
	}


	public static boolean addNewMember(String firstName, String lastName, char gender, Date birth, String phone, Date end,
			double h, double w) {
		return SOAddNewMember.execute(model, firstName, lastName, gender, birth, phone, end, h, w);
	}


	public static boolean removeMember(int id) {
		return SORemoveMember.execute(model,id);
	}


	public static Member findMemberId(int id) {
		return SOFindMemberId.execute(model, id);
	}


	public static boolean updateMember(int id, String firstName, String lastName, char gender, Date birth,
			String phoneNumber, Date end, double h, double w) {
		return SOEditMember.execute(model, id, firstName, lastName, gender, birth, phoneNumber, end, h, w);
	}


	public static LinkedList<Member> findMembersName(String name) {
		return SOFindMembersFirstName.execute(model, name);
	}


	public static LinkedList<Member> findMembersLastName(String lastName) {
		return SOFindMembersLastName.execute(model, lastName);
	}


	public static boolean enterRecord(int id) {
		return SOEnterRecord.execute(model, id);
	}
	
}
