package ex3.corrigetemp;

public class Aquarium extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size()*0.1;
	}

}
