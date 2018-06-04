package main.de.dhbw.mockito;

public class TaxHelper {
	
	public double addTax(double initialValue, ValueAddedTax valueAddedTax){
		return initialValue * (1 + (valueAddedTax.getTaxPercentage()/100));
	}

	public double deductTax(double initialValue, ValueAddedTax valueAddedTax){
		return initialValue*(100/(100+valueAddedTax.getTaxPercentage()));
	}
}
