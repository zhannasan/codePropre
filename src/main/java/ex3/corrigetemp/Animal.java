package ex3.corrigetemp;

public class Animal {

	private String nom;
	private String type;
	private String comportement;
	
	/** Constructeur
	 * @param nom nom
	 * @param type type
	 * @param comportement comportement
	 */
	public Animal(String nom, String type, String comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/** Getter for comportement
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}
	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}


}
