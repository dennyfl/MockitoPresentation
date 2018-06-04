package main.de.dhbw.tutorial;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	@Override
	public int subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	@Override
	public double devide(int firstNumber, int secondNumber) {
		if (secondNumber != 0) {
			return firstNumber / secondNumber;
		} else {
			throw new NumberFormatException();
		}
	}
}
