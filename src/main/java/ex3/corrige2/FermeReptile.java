package ex3.corrige2;

/** Zone spécialisée: Ferme à reptiles
 * @author DIGINAMIC
 */
public class FermeReptile extends Zone {
	
	/** MASSE_MOYENNE : double */
	private static final double MASSE_MOYENNE = 0.1;

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * MASSE_MOYENNE;
	}
	
	@Override
	public boolean verifierHebergementAnimal(Animal animal) {
		return animal.getType().equals(Type.REPTILE);
	}
}