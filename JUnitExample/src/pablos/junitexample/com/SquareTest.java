package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.square(5);
		assertEquals(25, out);
	}

}
