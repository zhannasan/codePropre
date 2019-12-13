package ex3;

import java.util.ArrayList;
import java.util.List;

public class Aquarium extends ZoneZoo{
	List<Animal> aquarium  = new ArrayList<Animal>();
	private static final String Zoo_A="Aquarium";

	/**
	 * @return the aquarium
	 */
	public List<Animal> getAquarium() {
		return aquarium;
	}

	/**
	 * @param aquarium the aquarium to set
	 */
	public void setAquarium(List<Animal> aquarium) {
		this.aquarium = aquarium;
	}

	@Override
	public double calculerKgsNourritureParJour(){
		return animal.getSize() * 0.2;
	}
}
