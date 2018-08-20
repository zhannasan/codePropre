package ex3.corrigetemp;

import java.util.List;

public class SavaneAfricaine {

	private List<Animal> animaux;

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	public void afficherListeAnimaux() {
		for (Animal animal : animaux) {
			System.out.println(animal.getNom());
		}
	}

	public int compterAnimaux() {
		return animaux.size();
	}

	public int calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}
}
