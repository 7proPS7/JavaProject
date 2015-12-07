package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.add(5);
		assertEquals(10, out);
	}

}
