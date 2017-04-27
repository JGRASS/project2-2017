package domen;

import java.util.GregorianCalendar;

public class Member {

	private int id;
	private String firstName;
	private String lastName;
	private char gender;
	private GregorianCalendar birthdate;
	private String phoneNumber;
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	private double height;
	private double weight;

	public Member() {
	}

	public Member(int id, String firstName, String lastName, char gender, GregorianCalendar birthdate,
			String phoneNumber, GregorianCalendar startDate, GregorianCalendar endDate, double height, double weight) {
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

	public Member(int id, String firstName, String lastName, char gender, GregorianCalendar startDate,
			GregorianCalendar endDate) {
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

	public GregorianCalendar getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(GregorianCalendar birthdate) {
		this.birthdate = birthdate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public GregorianCalendar getStartDate() {
		return startDate;
	}

	public void setStartDate(GregorianCalendar startDate) {
		this.startDate = startDate;
	}

	public GregorianCalendar getEndDate() {
		return endDate;
	}

	public void setEndDate(GregorianCalendar endDate) {
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

}
