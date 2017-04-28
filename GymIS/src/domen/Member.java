package domen;

import java.sql.Date;


public class Member {

	private int id;
	private String firstName;
	private String lastName;
	private char gender;
	private Date birthdate;
	private String phoneNumber;
	private Date startDate;
	private Date endDate;
	private double height;
	private double weight;

	public Member() {
	}

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

	public Member(int id, String firstName, String lastName, char gender, Date startDate, Date endDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

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

	@Override
	public String toString() {
		return "ID: " + getId() + " Ime: " + getFirstName() + " Prezime: " + getLastName() + " Pol: " + getGender()
				+ " Datum rodjenja: " + getBirthdate() + " Tel: " + getPhoneNumber() + " Upis: " + getStartDate()
				+ " Clanarina do: " + getEndDate() + " Visna: " + getHeight() + " Tezina: " + getWeight();
	}

}
