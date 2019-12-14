package ex3;

import java.util.ArrayList;
import java.util.List;

public class FermeReptile extends ZoneZoo {
	List<Animal> fermeReptile = new ArrayList<Animal>();
	private static final String Zoo_FR = "FermeReptile";

	/**
	 * @return the fermeReptile
	 */
	public List<Animal> getFermeReptile() {
		return fermeReptile;
	}

	/**
	 * @param fermeReptile
	 *            the fermeReptile to set
	 */
	public void setFermeReptile(List<Animal> fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	public String getZone() {
		return Zoo_FR;
	}

}
