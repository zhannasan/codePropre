package ex3.corrige1;

/** Zone spécialisée: Savane Africaine
 * @author DIGINAMIC
 */
public class SavaneAfricaine extends Zone {

	/** MASSE_MOYENNE : double */
	private static final double MASSE_MOYENNE = 10.0;

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * MASSE_MOYENNE;
	}
	
	@Override
	public ZoneZoo getZoneZoo() {
		return ZoneZoo.SAVANE_AFRICAINE;
	}

}