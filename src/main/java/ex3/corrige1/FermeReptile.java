package ex3.corrige1;

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
	public ZoneZoo getZoneZoo() {
		return ZoneZoo.FERME_REPTILE;
	}
}