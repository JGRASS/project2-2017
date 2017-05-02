package domen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GymWorkerTest {
	
	GymWorker gm;
	
	@Before
	public void setUp() throws Exception {
		gm = new GymWorker();
	}

	@After
	public void tearDown() throws Exception {
		gm = null;
	}

	@Test
	public void testSetId() {
		gm.setId(6);
		assertEquals(6, gm.getId());
	}
	
	@Test
	public void testSetUsername() {
		gm.setUsername("radnik");
		assertEquals("radnik", gm.getUsername());
	}

	@Test
	public void testSetPassword() {
		gm.setPassword("1234");
		assertEquals("1234", gm.getPassword());
	}

	@Test
	public void testToString() {
		gm.setId(1);
		gm.setUsername("filip");
		gm.setPassword("1111");
		assertEquals("ID: 1 Username: filip Password: 1111", gm.toString());
	}

}
