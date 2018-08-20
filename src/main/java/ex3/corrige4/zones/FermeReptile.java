package ex3.corrige4.zones;

import ex3.corrige3.Type;
import ex3.corrige3.animaux.Animal;

/** Ferme aux reptiles
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {

	/** MASSE_MOYENNE : double */
	private static final double MASSE_MOYENNE = 0.1;

	@Override
	public double getMasse() {
		return MASSE_MOYENNE;
	}
	
	@Override
	public boolean acceptAnimal(Animal animal) {
		return animal.getType().equals(Type.REPTILE);
	}
}