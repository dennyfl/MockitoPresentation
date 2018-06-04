package main.de.dhbw.mockito;

import java.util.List;

public class Customer {

	private String name;
	private int customerNumber;
	private List<Bill> bills;

	public Customer(String name, int customerNumber) {
		this.name = name;
		this.customerNumber = customerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public List<Bill> getBills() {
		return bills;
	}

	public void setBills(List<Bill> bills) {
		this.bills = bills;
	}
}
