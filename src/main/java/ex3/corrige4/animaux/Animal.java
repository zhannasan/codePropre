package ex3.corrige4.animaux;

import ex3.corrige3.Comportement;
import ex3.corrige3.Type;

/** Représente une animal
 * @author DIGINAMIC
 */
public abstract class Animal {
	/** nom : String */
	private String nom;
	/** type : Type */
	private Type type;
	/** comportement : Comportement */
	private Comportement comportement;
	
	/** Constructeur
	 * @param nom nom
	 * @param type type d'animal
	 * @param comportement comportement alimentaire
	 */
	public Animal(String nom, Type type, Comportement comportement) {
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

	/** Getter for comportement
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}
	/** Setter
	 * @param comportement the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
	/** Getter for type
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

}
