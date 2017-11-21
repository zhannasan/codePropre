package demeter.noncorrige;

public class Customer {
	
	private Wallet wallet;

	public Customer() {

	}

	public Customer(Wallet wallet) {
		this.wallet = wallet;
	}

	/**
	 * Getter for wallet
	 * 
	 * @return the wallet
	 */
	public Wallet getWallet() {
		return wallet;
	}

	/**
	 * Setter
	 * 
	 * @param wallet
	 *            the wallet to set
	 */
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
}
