package ex3;

import java.util.ArrayList;
import java.util.List;

public class SavaneAfricaine extends ZoneZoo {
	List<Animal> savaneAfricaine = new ArrayList<Animal>();
	private static final String Zoo_SA = "SavaneAfricaine";

	/**
	 * @param savaneAfricaine
	 */
	public SavaneAfricaine() {
		super();
	}

	/**
	 * @return the savaneAfricaine
	 */
	public List<Animal> getSavaneAfricaine() {
		return savaneAfricaine;
	}

	/**
	 * @param savaneAfricaine
	 *            the savaneAfricaine to set
	 */
	public void setSavaneAfricaine(List<Animal> savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}

	public String getZone() {
		return Zoo_SA;
	}
}
