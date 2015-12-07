package pablos.junitexample.com;

public class JUnitTest {

	public int add(int a) {
		return a + a;
	}

	public int addTwoValues(int a, int b) {
		return a + b;
	}

	public int mult(int a) {
		return a * a;
	}

	public int multTwoValues(int a, int b) {
		return a * b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public double division(int a, int b) {
		if (b == 0) {
			System.out.println("Wrong");
		}
		double sc = a / b;
		return sc;

	}

	public int modulo(int a, int b) {
		return a % b;
	}

	public int square(int a) {
		return a * a;
	}

	public int rectangle(int a, int b) {
		return a * b;
	}

}
