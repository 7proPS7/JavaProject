package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTwoValuesTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.addTwoValues(4, 8);
		assertEquals(12, out);
	}

}
