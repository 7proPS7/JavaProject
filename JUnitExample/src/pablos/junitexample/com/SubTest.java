package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.sub(15, 6);
		assertEquals(9, out);
	}

}
