package ex3.corrige3.animaux;

import ex3.corrige3.Comportement;
import ex3.corrige3.Type;

/** Repésente un poisson
 * @author DIGINAMIC
 */
public class Poisson extends Animal {

	/** Constructeur
	 * @param nom nom
	 * @param type type d'animal
	 * @param comportement comportement alimentaire
	 */
	public Poisson(String nom, Comportement comportement) {
		super(nom, Type.POISSON, comportement);
	}
}
