package main.de.dhbw.mockito;

public class ValueAddedTax {

	private double taxPercentage;

	public ValueAddedTax(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
}
