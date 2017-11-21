package demeter.noncorrige;

public class Wallet {
	
	private double money;
	
	public Wallet(double money) {
		this.money = money;
	}
	
	/** Getter for money
	 * @return the money
	 */
	public double getMoney() {
		return money;
	}
	/** Setter
	 * @param money the money to set
	 */
	public void setMoney(double money) {
		this.money = money;
	}
}