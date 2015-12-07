package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultTwoValuesTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.multTwoValues(4, 5);
		assertEquals(20, out);
	}

}
