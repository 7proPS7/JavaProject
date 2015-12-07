package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		double out = jtest.triangle(5, 4);
		assertEquals(10, out, DELTA);
	}

}
