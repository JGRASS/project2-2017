package domen;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.Time;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimestampTest {
	Timestamp t;

	@Before
	public void setUp() throws Exception {
		t = new Timestamp();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void testSetId() {
		t.setId(1);
		assertEquals(1, t.getId());
	}

	@Test
	public void testSetDate() {
		t.setDate(Date.valueOf("2011-11-11"));
		assertEquals(Date.valueOf("2011-11-11"), t.getDate());
	}

	@Test
	public void testSetTime() {
		t.setTime(Time.valueOf("01:01:01"));
		assertEquals(Time.valueOf("01:01:01"), t.getTime());
	}

	@Test
	public void testToString() {
		t.setId(1);
		t.setDate(Date.valueOf("2011-11-11"));
		t.setTime(Time.valueOf("01:01:01"));
		assertEquals("Date: 2011-11-11 Time: 01:01:01", t.toString());
		
	}

}
