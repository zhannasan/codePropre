package ex3.corrige1;

/** Repésente un animal
 * @author DIGINAMIC
 */
public class Animal {

	/** nom : String */
	protected String nom;
	/** comportement : Comportement */
	protected Comportement comportement;
	/** type : Type */
	protected Type type;
	/** zoneZoo : ZoneZoo */
	protected ZoneZoo zoneZoo;

	/**Constructeur
	 * @param nom nom
	 * @param comportement comportement alimentaire
	 * @param type type d'animal (cf {@link Type})
	 */
	public Animal(String nom, Comportement comportement, Type type, ZoneZoo zoneZoo) {
		this.nom = nom;
		this.comportement = comportement;
		this.type = type;
		this.zoneZoo = zoneZoo;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder(nom).append(" | ").append(comportement.toString());
		System.out.println(str);
		return str.toString();
	}

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

	/** Getter for zoneZoo
	 * @return the zoneZoo
	 */
	public ZoneZoo getZoneZoo() {
		return zoneZoo;
	}

	/** Setter
	 * @param zoneZoo the zoneZoo to set
	 */
	public void setZoneZoo(ZoneZoo zoneZoo) {
		this.zoneZoo = zoneZoo;
	}
}