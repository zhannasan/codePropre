package demeter.corrige;

import java.util.ArrayList;
import java.util.List;

public class Paperboy {
	private List<Customer> customers;
	private double funds;

	public Paperboy() {
		this.customers = new ArrayList<>();
	}

	public void collectPayments() {
		// Le journal coûte 1€
		double payment = 1.0;

		for (Customer customer : customers) {
			double amount = customer.makePayment(payment);
			if (amount != 0.0) {
				funds += amount;
			}
		}
	}

	/**
	 * Getter for customers
	 * 
	 * @return the customers
	 */
	public List<Customer> getCustomers() {
		return customers;
	}

	/**
	 * Setter
	 * 
	 * @param customers
	 *            the customers to set
	 */
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	/**
	 * Getter for funds
	 * 
	 * @return the funds
	 */
	public double getFunds() {
		return funds;
	}

	/**
	 * Setter
	 * 
	 * @param funds
	 *            the funds to set
	 */
	public void setFunds(double funds) {
		this.funds = funds;
	}
}
