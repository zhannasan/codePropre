package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;
	private final String TYPE_CC="CC";
	private final String TYPE_LA="LA";
	
	/**
	 * @param solde solde du compte
	 * @param decouvert option pour les comptes courants
	 * 
	 */
	public CompteBancaire(double solde, double decouvert) {
		super();
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void crediterMontant(double montant){
		this.solde += montant;
	}
	
	/** Soustrait un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (getType().equals(TYPE_CC)){
			if (this.solde - montant >= - this.decouvert){
				this.solde = solde - montant;
			}else{
				System.out.println("Vous ne pouvez pas depasser le decouvert");
			}
		}else{
			if (this.solde - montant >= 0){
				this.solde = solde - montant;
			}	
		}
	}
	
	/** Calcule le solde apres l'ajout de taux de renumeration*/
	public void appliquerRemunerationAnnuelle(){
		if (getType().equals(TYPE_LA)){
			this.solde = solde*(1 + getTauxRemuneration()/100);
		}
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		if(getType().equals(TYPE_CC)){
			this.decouvert = decouvert;
		}
	}
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return TYPE_CC;
	}

}
