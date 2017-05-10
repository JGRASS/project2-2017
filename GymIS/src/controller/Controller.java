package controller;

import java.sql.Date;
import java.util.LinkedList;

import domen.Member;
import model.Model;
import system_operations.SOAddNewMember;
import system_operations.SOGetAllMembers;
import system_operations.SOLogIn;

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
	
}
