package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		double out = jtest.division(25, 5);
		assertEquals(5, out, DELTA);
	}

}
