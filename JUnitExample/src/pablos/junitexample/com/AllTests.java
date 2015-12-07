package pablos.junitexample.com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddTest.class, AddTwoValuesTest.class, DivisionTest.class, ModuloTest.class, MultTest.class,
		MultTwoValuesTest.class, RectangleTest.class, SquareTest.class, SubTest.class })
public class AllTests {

}
