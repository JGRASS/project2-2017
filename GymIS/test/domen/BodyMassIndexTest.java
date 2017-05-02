package domen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BodyMassIndexTest {
	BodyMassIndex bmi;

	@Before
	public void setUp() throws Exception {
		bmi = new BodyMassIndex();
	}

	@After
	public void tearDown() throws Exception {
		bmi = null;
	}

	@Test
	public void testSetId() {
		bmi.setId(1);
		assertEquals(1, bmi.getId());
	}

	@Test
	public void testSetBmiValue() {
		bmi.setBmiValue(150, 50);
		assertEquals((50.0 / (150*150)) * 10000, bmi.getBmiValue(), 0.5);
	}
	
	@Test
	public void testSetBmiValueWeightZero() {
		bmi.setBmiValue(150, 0);
		assertEquals(0, bmi.getBmiValue(), 0);
	}
	
	@Test
	public void testSetBmiValueHeightZero() {
		bmi.setBmiValue(0, 50);
		assertEquals(0, bmi.getBmiValue(), 0);
	}

	@Test
	public void testToString() {
		bmi.setId(1);
		bmi.setBmiValue(150, 50);
		assertEquals("ID: 1 BMI Value: 22.22222222222222", bmi.toString());
	}

}
