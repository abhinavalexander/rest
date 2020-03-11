package JunitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalulatorTest {
	private Calculator calc;

	@Before
	public void SetUp() throws Exception {
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testAdd() {
		double result = calc.add(10.5, 20.32);
		assertEquals(30.82,result,0);
	}

	@Test
	public void testSub() {
		double result = calc.subtract(100.51, 20.48);
		assertEquals(80.03,result,0);
	}

	@Test
	public void testMul() {
		double result = calc.multiply(10, 20.55);
		assertEquals(205.5,result,0);
	}

	@Test
	public void testDiv() {
		double result = calc.divide(10, 2);
		assertEquals(5,result,0.0001);
	}
}
