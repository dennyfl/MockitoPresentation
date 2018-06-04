package main.de.dhbw.mockito;

import java.util.ArrayList;
import java.util.List;

public class BillingService {

	private TaxHelper taxHelper;

	public BillingService(TaxHelper taxHelper) {
		this.taxHelper = taxHelper;
	}

	public double addTax(double initialValue, ValueAddedTax valueAddedTax) {
		try {
			return taxHelper.addTax(initialValue, valueAddedTax);
		} catch (NumberFormatException e) {
			throw new BillingServiceException();
		}
	}

	public double deductTax(double initialValue, ValueAddedTax valueAddedTax) {
		try {
			return taxHelper.deductTax(initialValue, valueAddedTax);
		} catch (NumberFormatException e) {
			throw new BillingServiceException();
		}
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
