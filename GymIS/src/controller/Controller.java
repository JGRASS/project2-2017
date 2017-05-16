package controller;

import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedList;

import domen.Member;
import domen.Timestamp;
import model.Model;
import system_operations.SOAddNewMember;
import system_operations.SOEditMember;
import system_operations.SOEnterRecord;
import system_operations.SOFindMemberId;
import system_operations.SOFindMembersFirstName;
import system_operations.SOFindMembersLastName;
import system_operations.SOGetAllMembers;
import system_operations.SOGetEvidenceOfMember;
import system_operations.SOLogIn;
import system_operations.SOPayMembership;
import system_operations.SORemoveMember;

public class Controller {
	private static Model model = new Model();

	/**
	 * Metoda za prijavu radnika.
	 * 
	 * @param username
	 *            - Korisnicko ime radnika.
	 * @param pass
	 *            - Lozinka radnika.
	 * @return true ako je radnik uspesno prijavljen.
	 */
	public static boolean logIn(String username, String pass) {
		return SOLogIn.execute(model, username, pass);
	}

	/**
	 * Metoda vraca listu svih clanova.
	 * 
	 * @return Listu objekata {@link Member}
	 */
	public static LinkedList<Member> getAllMembers() {
		return SOGetAllMembers.execute(model);
	}

	/**
	 * Metoda na osnovu parametara dodaje novog clana u bazu podataka.
	 * 
	 * @param firstName
	 *            - Ime clana.
	 * @param lastName
	 *            - Prezime clana.
	 * @param gender
	 *            - Pol clana.
	 * @param birth
	 *            - Datum rodjenja clana.
	 * @param phone
	 *            - Broj telefona clana.
	 * @param end
	 *            - Datum do kog je platio clanarinu.
	 * @param h
	 *            - Visina clana.
	 * @param w
	 *            - Tezina clana.
	 * @return True ako je clan uspesno dodat.
	 */
	public static boolean addNewMember(String firstName, String lastName, char gender, Date birth, String phone,
			Date end, double h, double w) {
		return SOAddNewMember.execute(model, firstName, lastName, gender, birth, phone, end, h, w);
	}

	/**
	 * Metoda za brisanje clana iz baze.
	 * 
	 * @param id
	 *            - Jedinstveni indetifikator clana.
	 * @return True ako je clan uspesno uklonjen.
	 */
	public static boolean removeMember(int id) {
		return SORemoveMember.execute(model, id);
	}

	/**
	 * Metoda za pretragu clana po ID.
	 * 
	 * @param id
	 *            - Jedinstveni indetifikator clana.
	 * @return Objekat klase {@link Member}
	 */
	public static Member findMemberId(int id) {
		return SOFindMemberId.execute(model, id);
	}

	/**
	 * Metoda na osnovu parametara menja podatke o clanu.
	 * 
	 * @param id
	 *            - Jedinstveni indetifikator clana.
	 * @param firstName
	 *            - Ime clana.
	 * @param lastName
	 *            - Prezime clana.
	 * @param gender
	 *            - Pol clana.
	 * @param birth
	 *            - Datum rodjenja clana.
	 * @param phoneNumber
	 *            - Broj telefona clana.
	 * @param end
	 *            - Datum do kog je platio clanarinu.
	 * @param h
	 *            - Visina clana.
	 * @param w
	 *            - Tezina clana.
	 * @return True ako su podaci o clanu uspesno izmenjeni.
	 */
	public static boolean updateMember(int id, String firstName, String lastName, char gender, Date birth,
			String phoneNumber, Date end, double h, double w) {
		return SOEditMember.execute(model, id, firstName, lastName, gender, birth, phoneNumber, end, h, w);
	}

	/**
	 * Metoda za pretragu clanova po imenu.
	 * 
	 * @param name
	 *            - Ime clana.
	 * @return Listu objekata {@link Member}
	 */
	public static LinkedList<Member> findMembersName(String name) {
		return SOFindMembersFirstName.execute(model, name);
	}

	/**
	 * Metoda za pretragu clanova po prezimenu.
	 * 
	 * @param lastName
	 *            - Prezime clana.
	 * @return
	 */
	public static LinkedList<Member> findMembersLastName(String lastName) {
		return SOFindMembersLastName.execute(model, lastName);
	}

	/**
	 * Metoda za upis evidencije o clanu.
	 * 
	 * @param id
	 *            - Jedinstveni indetifikator.
	 * @return True ako je uspesno evidentiran dolazak.
	 */
	public static boolean enterRecord(int id) {
		return SOEnterRecord.execute(model, id);
	}

	/**
	 * Metoda za placanje clanarine clana.
	 * 
	 * @param id
	 *            - Jedinstveni indetifikator.
	 * @param endDate
	 *            - Datum do kog placa clanarinu.
	 * @return True ako je clanarina uspesno uplacena.
	 */
	public static boolean payMembership(int id, String endDate) {
		return SOPayMembership.execute(model, id, endDate);
	}

	/**
	 * Metoda vraca listu svih evidencija o clanu.
	 * 
	 * @param id
	 *            - Jedinstveni indetifikator.
	 * @return Listu objekata {@link Timestamp}
	 */
	public static LinkedList<Timestamp> getAllRecords(int id) {
		return SOGetEvidenceOfMember.execute(model, id);
	}

}
