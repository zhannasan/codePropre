package ex3.corrige4.animaux;

import ex3.corrige3.Comportement;
import ex3.corrige3.Type;

/** Repésente un reptile
 * @author DIGINAMIC
 */
public class Reptile extends Animal {

	/** Constructeur
	 * @param nom nom
	 * @param type type d'animal
	 * @param comportement comportement alimentaire
	 */
	public Reptile(String nom, Comportement comportement) {
		super(nom, Type.REPTILE, comportement);
	}
}
