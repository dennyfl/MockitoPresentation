package test.de.dhbw;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import main.de.dhbw.BillingService;
import main.de.dhbw.TaxHelper;
import main.de.dhbw.ValueAddedTax;

@RunWith(MockitoJUnitRunner.class)
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
}
