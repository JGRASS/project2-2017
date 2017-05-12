package domen;

import java.sql.Date;

/**
 * Klasa koja sadrzi podatke clanu.. Odgovara arhitekturi baze.
 * 
 * @author Miljan Ignjatovic
 * @version 1.0
 *
 */
public class Member {

	/**
	 * Jedinstveni identifikator claa.
	 */
	private int id;
	/**
	 * Ime clana.
	 */
	private String firstName;
	/**
	 * Prezime clana.
	 */
	private String lastName;
	/**
	 * Pol clana.
	 */
	private char gender;
	/**
	 * Datum rodjena clana.
	 */
	private Date birthdate;
	/**
	 * Broj telefona clana.
	 */
	private String phoneNumber;
	/**
	 * Datum upisa clana.
	 */
	private Date startDate;
	/**
	 * Datum do kog je uplacena clanarina.
	 */
	private Date endDate;
	/**
	 * Visina clana.
	 */
	private double height;
	/**
	 * Tezina clana.
	 */
	private double weight;

	/**
	 * Prazan konstruktor za instancu klase Member.
	 */
	public Member() {
	}

	/**
	 * Kompletan konstruktor za instancu klase Member.
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param birthdate
	 * @param phoneNumber
	 * @param startDate
	 * @param endDate
	 * @param height
	 * @param weight
	 */
	public Member(int id, String firstName, String lastName, char gender, Date birthdate, String phoneNumber,
			Date startDate, Date endDate, double height, double weight) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * Konstruktor za instancu klase Member.
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param startDate
	 * @param endDate
	 */
	public Member(int id, String firstName, String lastName, char gender, Date startDate, Date endDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * Konstruktor za instancu klaze Member.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param birthdate
	 * @param phoneNumber
	 * @param endDate
	 * @param height
	 * @param weight
	 */
	public Member(String firstName, String lastName, char gender, Date birthdate, String phoneNumber, Date endDate,
			double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdate = birthdate;
		this.phoneNumber = phoneNumber;
		this.endDate = endDate;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * Get metoda za atribut id.
	 * 
	 * @return id - Jedinstveni identifikator clana kao int.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set metoda za atribut id.
	 * 
	 * @param id
	 *            - Jedinstveni identifikator clana kao int.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Get metoda za atribut firstName
	 * 
	 * @return firstName - Ime clana kao String.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set metoda za atribut firstName.
	 * 
	 * @param firstName
	 *            - Ime clana kao String.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Get metoda za atribut lastName.
	 * 
	 * @return lastName- Prezime clana kao String.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set metoda za atribut lastName.
	 * 
	 * @param lastName
	 *            - Prezime clana kao String.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Get metoda za atribut gender.
	 * 
	 * @return gender - Pol clana kao char.
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * Set metoda za atribut gender.
	 * 
	 * @param gender
	 *            - Pol clana kao char.
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * Get metoda za atribut birthdate.
	 * 
	 * @return birthdate - Datum rodjena clana kao Date @see java.sql.Date
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * Set metoda za atribut birthdate.
	 * 
	 * @param birthdate
	 *            - Datum rodjena clana kao Date @see java.sql.Date
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 * Get metoda za atribut phoneNumber.
	 * 
	 * @return phoneNumber - Broj telefona clana kao String.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Set metoda za atribut phoneNumber.
	 * 
	 * @param phoneNumber
	 *            - Broj telefona clana koa String.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Get metoda za atribut startDate.
	 * 
	 * @return startDate - Datum upisa clana kao Date @see java.sql.Date
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Set metoda za atribut startDate.
	 * 
	 * @param startDate
	 *            - Datum upisa clana kao Date @see java.sql.Date
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * Get metoda za atribut endDate.
	 * 
	 * @return endDate - Datum do kojeg je clan uplatio clanarinu Date @see
	 *         java.sql.Date
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Set metoda za atribut endDate.
	 * 
	 * @param endDate
	 *            - Datum do kojeg je caln uplatio clanarinu kao Date @see
	 *            java.sql.Date
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * Get metoda za atribut height.
	 * 
	 * @return height - Visina clana kao double.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Set metoda za atribut height.
	 * 
	 * @param height
	 *            - Visina clana kao double.
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Get metoda za atribut weight.
	 * 
	 * @return weight - Tezina clana kao double.
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Set metoda za atribut weight.
	 * 
	 * @param weight
	 *            - Visina clana kao double.
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * equals metoda za klasu Member.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof Member) {

				Member m = (Member) obj;
				if (m.getId() == this.getId())
					return true;
			}
		}

		return false;
	}

	/**
	 * toString metoda za klasu Member.
	 */
	@Override
	public String toString() {
		return "ID: " + getId() + " Ime: " + getFirstName() + " Prezime: " + getLastName() + " Pol: " + getGender()
				+ " Datum rodjenja: " + getBirthdate() + " Tel: " + getPhoneNumber() + " Upis: " + getStartDate()
				+ " Clanarina do: " + getEndDate() + " Visna: " + getHeight() + " Tezina: " + getWeight();
	}

}
