package test.de.dhbw.mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import main.de.dhbw.mockito.Bill;
import main.de.dhbw.mockito.BillingService;
import main.de.dhbw.mockito.BillingServiceException;
import main.de.dhbw.mockito.Customer;
import main.de.dhbw.mockito.TaxHelper;
import main.de.dhbw.mockito.ValueAddedTax;

public class BillingServiceTest {

	TaxHelper taxHelper = Mockito.mock(TaxHelper.class);

	BillingService objectUnderTest = new BillingService(taxHelper);

	@Test
	public void addTaxTest() {
		ValueAddedTax valueAddedTax = new ValueAddedTax(19.0);
		when(taxHelper.addTax(100.0, valueAddedTax)).thenReturn(119.0);
		assertTrue(119.0 == objectUnderTest.addTax(100.0, valueAddedTax));
		Mockito.verify(taxHelper).addTax(100.0, valueAddedTax);
	}

	@Test
	public void deductTaxTest() {
		ValueAddedTax valueAddedTax = new ValueAddedTax(19.0);
		when(taxHelper.deductTax(119.0, valueAddedTax)).thenReturn(100.0);
		assertTrue(100.0 == objectUnderTest.deductTax(119.0, valueAddedTax));
		Mockito.verify(taxHelper).deductTax(119.0, valueAddedTax);
	}

	@Test(expected = BillingServiceException.class)
	public void deductTaxFailTest() {
		ValueAddedTax valueAddedTax = new ValueAddedTax(19.0);
		when(taxHelper.deductTax(119.0, valueAddedTax)).thenThrow(new NumberFormatException());

		assertTrue(100.0 == objectUnderTest.deductTax(119.0, valueAddedTax));
	}

	@Test
	public void addTaxToBillsTest() {
		ValueAddedTax valueAddedTax = new ValueAddedTax(19.0);
		when(taxHelper.addTax(100.0, valueAddedTax)).thenReturn(119.0);
		when(taxHelper.addTax(200.0, valueAddedTax)).thenReturn(238.0);
		when(taxHelper.addTax(300.0, valueAddedTax)).thenReturn(357.0);
		Customer customer = new Customer("Denny", 42);
		Bill bill1 = new Bill(42, "laptop", 100.0);
		Bill bill2 = new Bill(666, "laptop", 200.0);
		Bill bill3 = new Bill(13, "laptop", 300.0);
		List<Bill> bills = new ArrayList<>();
		bills.add(bill1);
		bills.add(bill2);
		bills.add(bill3);
		customer.setBills(bills);
		Customer customerWithHigherBills = objectUnderTest.addTaxToBills(customer, valueAddedTax);
		assertTrue(customerWithHigherBills.getBills().get(0).getAmount()==119.0);
		assertTrue(customerWithHigherBills.getBills().get(1).getAmount()==238.0);
		assertTrue(customerWithHigherBills.getBills().get(2).getAmount()==357.0);
	}
}
