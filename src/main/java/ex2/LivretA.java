package ex2;

/**Représente un compte bancaire de type livret A (type=LA)
 *
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rémunération */
	double tauxRemuneration;
	private final String TYPE_LA="LA";
	
	/**
	 * @param solde solde du compte
	 * @param tauxRemuneration taux de rémunération
	 * decouvert est toujours 0 pour le LivretA
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration =tauxRemuneration;
	}
	
	@Override
	public String getType() {
		return TYPE_LA;
	}

	/**
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

}
