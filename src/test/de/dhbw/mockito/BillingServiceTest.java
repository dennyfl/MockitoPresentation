package test.de.dhbw.mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import main.de.dhbw.mockito.BillingService;
import main.de.dhbw.mockito.BillingServiceException;
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
	}

	@Test
	public void deductTaxTest() {
		ValueAddedTax valueAddedTax = new ValueAddedTax(19.0);
		when(taxHelper.deductTax(119.0, valueAddedTax)).thenReturn(100.0);

		assertTrue(100.0 == objectUnderTest.deductTax(119.0, valueAddedTax));
	}

	@Test(expected = BillingServiceException.class)
	public void deductTaxFailTest() {
		ValueAddedTax valueAddedTax = new ValueAddedTax(19.0);
		when(taxHelper.deductTax(119.0, valueAddedTax)).thenThrow(new NumberFormatException());

		assertTrue(100.0 == objectUnderTest.deductTax(119.0, valueAddedTax));
	}

	@Test
	public void addTaxToBillsTest() {

	}
}
