package ex3.corrige2;

/** Représente un animal
 * @author DIGINAMIC
 */
public abstract class Animal {

	/** nom : String */
	protected String nom;
	/** comportement : Comportement */
	protected Comportement comportement;
	/** type : Type */
	protected Type type;

	/**Constructeur
	 * @param nom nom
	 * @param comportement comportement alimentaire
	 */
	public Animal(String nom, Comportement comportement) {
		this.nom = nom;
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(nom).append(" | ").append(comportement.toString());
		return str.toString();
	}
	
	/** Retourne le type d'animal
	 * @return {@link Type}
	 */
	public abstract Type getType();

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}

	/** Setter
	 * @param comportement
	 *            the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
}