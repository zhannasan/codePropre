package ex3.corrige2;

/** Représente un reptile
 * @author DIGINAMIC
 */
public class Reptile extends Animal {
	
	/** Constructeur
	 * @param nom nom de l'animal
	 * @param comportement comportement alimentaire
	 */
	public Reptile(String nom, Comportement comportement) {
		super(nom, comportement);
	}
	
	@Override
	public Type getType() {
		return Type.REPTILE;
	}

}