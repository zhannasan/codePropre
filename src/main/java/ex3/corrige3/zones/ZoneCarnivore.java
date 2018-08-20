package ex3.corrige3.zones;

import ex3.corrige3.Comportement;
import ex3.corrige3.Type;
import ex3.corrige3.animaux.Animal;

/** Zone carnivore
 * @author DIGINAMIC
 */
public class ZoneCarnivore extends Zone {

	/** MASSE_MOYENNE : double */
	private static final double MASSE_MOYENNE = 10.0;

	@Override
	public double getMasse() {
		return MASSE_MOYENNE;
	}
	
	@Override
	public boolean acceptAnimal(Animal animal) {
		return animal.getType().equals(Type.MAMMIFERE) 
		    && animal.getComportement().equals(Comportement.CARNIVORE);
	}
}