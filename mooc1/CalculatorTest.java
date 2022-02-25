import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {
	// "Test" string at the end of the class name is necessary
	// It tells the programming environment that this is a test class
	// 
	// Without the string Test, the tests in the class will not be executed.
	
	@Test
	// annotation is must
	// This tells the JUnit test framework that this is an executable test method
	public void calculatorInitialValueZero() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.getValue());
	}
}
