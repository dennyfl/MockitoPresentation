package test.de.dhbw.tutorial;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import main.de.dhbw.tutorial.Calculator;
import main.de.dhbw.tutorial.CalculatorException;
import main.de.dhbw.tutorial.CalculatorService;

public class TutorialCalculatorTestCompleted {

	CalculatorService calculator = Mockito.mock(CalculatorService.class);

	Calculator objectUnderTest = new Calculator();

	@Test
	public void addTest() {
		when(calculator.add(2, 2)).thenReturn(4); //mock service behavior
		assertTrue(objectUnderTest.add(2, 2)==4); //test calculator method
	}

	@Test
	public void subtractTest() {
		when(calculator.subtract(10, 8)).thenReturn(2); //mock service behavior
		assertTrue(objectUnderTest.subtract(10, 8)==2); //test calculator method
	}

	@Test
	public void multiplyTest() {
		when(calculator.multiply(6, 6)).thenReturn(36); //mock service behavior
		assertTrue(objectUnderTest.multiply(6, 6)==36); //test calculator method
	}

	@Test
	public void divideTest() {
		when(calculator.divide(42, 7)).thenReturn(6.0); //mock service behavior
		assertTrue(objectUnderTest.divide(42, 7)==6.0); //test calculator method
	}

	@Test(expected = CalculatorException.class)
	public void divideByZeroTest() {
		when(calculator.divide(60, 0)).thenThrow(new NumberFormatException());  //mock service behavior, throwing the exception
		objectUnderTest.divide(60, 0); //execute method, exception gets thrown, caught and rethrown 
	}
}
