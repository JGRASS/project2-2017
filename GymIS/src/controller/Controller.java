package controller;

import model.Model;
import system_operations.SOLogIn;

public class Controller {
	private static Model m = new Model();

	public static boolean logIn(String username, String pass) {
		return SOLogIn.execute(m, username, pass);
	}
	
}
