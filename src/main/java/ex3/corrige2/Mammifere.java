package ex3.corrige2;

/** Représente un mammifère
 * @author DIGINAMIC
 */
public class Mammifere extends Animal {

	/**
	 * Constructeur des mammiferes
	 * 
	 * @param nom nom
	 * @param comportement comportement alimentaire
	 */
	public Mammifere(String nom, Comportement comportement) {
		super(nom, comportement);
	}

	@Override
	public Type getType() {
		return Type.MAMMIFERE;
	}

}