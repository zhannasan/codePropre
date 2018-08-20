package ex2.corrige;
/** Représente un compte bancaire
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : double */
	protected double solde;
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;

	/**
	 * Constructeur prenant en solde et un découvert en paramètre. 
	 * 
	 * @param solde solde du compte forcément strictement positif à la création
	 * @param decouvert valeur négative (ex: -2000)
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}

	/**
	 * Débite un montant du compte si le montant du découvert n'est pas dépassé
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
	}

	/** Getter
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/** Setter
	 * @param decouvert
	 *            the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
}