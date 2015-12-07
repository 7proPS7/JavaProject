package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.rectangle(2, 3);
		assertEquals(6, out);
	}

}
