package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class ZoneZoo {
	private List<Animal> animals = new ArrayList<Animal>();
	Animal animal;

	/** ajouter un animal a la liste
	 * @param animal
	 *           
	 */
	public void addAnimal(Animal animal) {
		List<Animal> animalsNew = new ArrayList<Animal>(animals.size() + 1);
		animalsNew.addAll(animals);
		animalsNew.add(animal);
		animals = animalsNew;
	}

	/**
	 * afficher la liste des animaux dans la zone
	 */
	public void afficherListeAnimaux() {
		for (Animal a : animals) {
			System.out.println(a.getNomAnimal() + " " + a.getComportement() + " " + a.getTypeAnimal() + " "
					+ a.getSize() + "kg");
		}
	}

	/**
	 * afficher le comportement d'animal
	 */
	public void afficherComportement() {
		for (Animal a : animals) {
			System.out.println(a.getComportement());
		}
	}

	/**
	 * afficher le type d'animal
	 */
	public void afficherType() {
		for (Animal a : animals) {
			System.out.println(a.getTypeAnimal());
		}
	}

	/** Constructeur sans parametres de Zone Zoo
	 * 
	 */
	public ZoneZoo() {
		super();
	}

	/**
	 * @return type de zone
	 */
	abstract String getZone();
}
