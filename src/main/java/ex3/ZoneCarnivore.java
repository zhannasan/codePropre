package ex3;

import java.util.ArrayList;
import java.util.List;

public class ZoneCarnivore extends ZoneZoo{
	List<Animal> zoneCarnivore = new ArrayList<Animal>();
	
	private static final String Zoo_ZC="ZoneCarnivore";

	/**
	 * @return the zoneCarnivore
	 */
	public List<Animal> getZoneCarnivore() {
		return zoneCarnivore;
	}

	/**
	 * @param zoneCarnivore the zoneCarnivore to set
	 */
	public void setZoneCarnivore(List<Animal> zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}
	
	
}
