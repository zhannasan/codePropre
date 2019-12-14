package ex4;

public class PretATerme implements Strategy {
	private double capital;
	private double capitalRestantDu;
	private double taux;
	private Strategy strategy;
	/**
	 * @param capital
	 * @param capitalRestantDu
	 * @param taux
	 */
	public PretATerme(double capital, double capitalRestantDu, double taux) {
		this.capital = capital;
		this.capitalRestantDu = capitalRestantDu;
		this.taux = taux;
	}
	/**
	 * @return the capital
	 */
	public double getCapital() {
		return capital;
	}
	/**
	 * @return the capitalRestantDu
	 */
	public double getCapitalRestantDu() {
		return capitalRestantDu;
	}
	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}
	/** Getter for strategy
	 * @return the strategy
	 */
	public Strategy getStrategy() {
		return strategy;
	}

	/** Setter
	 * @param strategy the strategy to set
	 */
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
