package ex3.corrige1;

/** Zone spécialisée: zone pour carnivores
 * @author DIGINAMIC
 */
public class ZoneCarnivore extends Zone {

	/** MASSE_MOYENNE : double */
	private static final double MASSE_MOYENNE = 10.0;
	
	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * MASSE_MOYENNE;
	}
	
	@Override
	public ZoneZoo getZoneZoo() {
		return ZoneZoo.ZONE_CARNIVORE;
	}
}