package main.de.dhbw.tutorial;

public class Calculator {

	CalculatorService calculatorService = new CalculatorServiceImpl();

	public int add(int numberOne, int numberTwo) {
		return calculatorService.add(numberOne, numberTwo);
	}

	public int subtract(int numberOne, int numberTwo) {
		return calculatorService.subtract(numberOne, numberTwo);
	}

	public int multiply(int numberOne, int numberTwo) {
		return calculatorService.multiply(numberOne, numberTwo);
	}

	public double divide(int numberOne, int numberTwo) {
		try {
			return calculatorService.divide(numberOne, numberTwo);
		} catch (NumberFormatException nfe) {
			throw new CalculatorException();
		}
	}
}
