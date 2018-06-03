package main.de.dhbw;

import java.util.ArrayList;
import java.util.List;

public class BillingService {

	private TaxHelper taxHelper;
	
	public BillingService(TaxHelper taxHelper){
		this.taxHelper = taxHelper;
	}

	public double addTax(double initialValue, ValueAddedTax valueAddedTax) {
		return taxHelper.addTax(initialValue, valueAddedTax);
	}

	public double deductTax(double initialValue, ValueAddedTax valueAddedTax) {
		return taxHelper.deductTax(initialValue, valueAddedTax);
	}

	public Customer addTaxToBills(Customer customer, ValueAddedTax valueAddedTax) {
		List<Bill> billsAfterTax = new ArrayList<>();
		for (Bill bill : customer.getBills()) {
			bill.setAmount(taxHelper.addTax(bill.getAmount(), valueAddedTax));
			billsAfterTax.add(bill);
		}
		customer.setBills(billsAfterTax);
		return customer;
	}
}
