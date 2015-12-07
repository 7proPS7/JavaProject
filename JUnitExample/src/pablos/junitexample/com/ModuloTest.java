package pablos.junitexample.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModuloTest {

	@Test
	public void test() {
		JUnitTest jtest = new JUnitTest();
		int out = jtest.modulo(5, 4);
		assertEquals(1, out);
	}

}
