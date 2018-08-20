package ex3.corrige4.animaux;

import ex3.corrige3.Comportement;
import ex3.corrige3.Type;

/** Repésente un mammifère
 * @author DIGINAMIC
 */
public class Mammifere extends Animal {

	/** Constructeur
	 * @param nom nom
	 * @param type type d'animal
	 * @param comportement comportement alimentaire
	 */
	public Mammifere(String nom, Comportement comportement) {
		super(nom, Type.MAMMIFERE, comportement);
	}
}
