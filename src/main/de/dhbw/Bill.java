package main.de.dhbw;

public class Bill {

	private int billingNumber;
	private String articleName;
	private double amount;

	public Bill(int billingNumber, String articleName, double amount) {
		this.billingNumber = billingNumber;
		this.articleName = articleName;
		this.amount = amount;
	}

	public int getBillingNumber() {
		return billingNumber;
	}

	public void setBillingNumber(int billingNumber) {
		this.billingNumber = billingNumber;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
}
