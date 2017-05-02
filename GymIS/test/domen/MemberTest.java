package domen;

import static org.junit.Assert.*;

//import java.util.Date;
import java.sql.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemberTest {

	private Member member;

	@Before
	public void setUp() throws Exception {
		member = new Member();
	}

	@After
	public void tearDown() throws Exception {
		member = null;
	}

	@Test
	public void testMemberIntStringStringCharDateStringDateDateDoubleDouble() {
		member = new Member(1, "Petar", "Petrovic", 'M', Date.valueOf("1996-10-10"), "0631234567",
				Date.valueOf("2016-11-11"), Date.valueOf("2018-11-11"), 198.5, 92.5);

		assertEquals(1, member.getId());
		assertEquals("Petar", member.getFirstName());
		assertEquals("Petrovic", member.getLastName());
		assertEquals('M', member.getGender());
		assertEquals(Date.valueOf("1996-10-10"), member.getBirthdate());
		assertEquals("0631234567", member.getPhoneNumber());
		assertEquals(Date.valueOf("2016-11-11"), member.getStartDate());
		assertEquals(Date.valueOf("2018-11-11"), member.getEndDate());
		assertEquals(198.5, member.getHeight(), 0);
		assertEquals(92.5, member.getWeight(), 0);

	}

	@Test
	public void testMemberIntStringStringCharDateDate() {
		member = new Member(1, "Petar", "Petrovic", 'M', Date.valueOf("2017-01-01"), Date.valueOf("2018-01-01"));

		assertEquals(1, member.getId());
		assertEquals("Petar", member.getFirstName());
		assertEquals("Petrovic", member.getLastName());
		assertEquals('M', member.getGender());
		assertEquals(Date.valueOf("2017-01-01"), member.getStartDate());
		assertEquals(Date.valueOf("2018-01-01"), member.getEndDate());

		assertEquals(null, member.getBirthdate());
		assertEquals(null, member.getPhoneNumber());
		assertEquals(0, member.getHeight(), 0);
		assertEquals(0, member.getWeight(), 0);

	}

	@Test
	public void testSetId() {
		member.setId(5);
		assertEquals(5, member.getId());
	}

	@Test
	public void testSetFirstName() {
		member.setFirstName("Filip");
		assertEquals("Filip", member.getFirstName());
	}

	@Test
	public void testSetLastName() {
		member.setLastName("Petrovic");
		assertEquals("Petrovic", member.getLastName());
	}

	@Test
	public void testSetGender() {
		member.setGender('M');
		assertEquals('M', member.getGender());
	}

	@Test
	public void testSetBirthdate() {
		member.setBirthdate(Date.valueOf("1900-01-01"));
		assertEquals(Date.valueOf("1900-01-01"), member.getBirthdate());
	}

	@Test
	public void testSetPhoneNumber() {
		member.setPhoneNumber("0631234567");
		assertEquals("0631234567", member.getPhoneNumber());
	}

	@Test
	public void testSetStartDate() {
		member.setStartDate(Date.valueOf("2017-10-10"));
		assertEquals(Date.valueOf("2017-10-10"), member.getStartDate());
	}

	@Test
	public void testSetEndDate() {
		member.setEndDate(Date.valueOf("2017-11-11"));
		assertEquals(Date.valueOf("2017-11-11"), member.getEndDate());
	}

	@Test
	public void testSetHeight() {
		member.setHeight(190.2);
		assertEquals(190.2, member.getHeight(), 0.5);
	}

	@Test
	public void testSetWeight() {
		member.setWeight(90.2);
		assertEquals(90.2, member.getWeight(), 0.5);
	}

	@Test
	public void testToString() {
		member = new Member(1, "Filip", "Petrovic", 'M', Date.valueOf("1996-01-01"), "0631234567",
				Date.valueOf("2016-01-01"), Date.valueOf("2017-01-01"), 175.5, 80.2);
		assertEquals(
				"ID: 1 Ime: Filip Prezime: Petrovic Pol: M Datum rodjenja: 1996-01-01 Tel: 0631234567 Upis: 2016-01-01 Clanarina do: 2017-01-01 Visna: 175.5 Tezina: 80.2",
				member.toString());

	}

}
