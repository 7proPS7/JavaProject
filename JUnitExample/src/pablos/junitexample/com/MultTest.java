package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.mult(6);
		assertEquals(36, out);
	}

}
