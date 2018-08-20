package ex3.corrige2;

/** Représente un poisson
 * @author DIGINAMIC
 */
public class Poisson extends Animal {
	
	/**
	 * Constructeur des Poissons
	 * 
	 * @param nom nom
	 * @param comportement comportement alimentaire
	 */
	public Poisson(String nom, Comportement comportement) {
		super(nom, comportement);
	}

	@Override
	public Type getType() {
		return Type.POISSON;
	}
}