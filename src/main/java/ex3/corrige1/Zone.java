package ex3.corrige1;

import java.util.ArrayList;
import java.util.List;

/** Représente une zone abstraite d'un Zoo
 * @author DIGINAMIC
 */
public abstract class Zone {
	
	/** animaux : List<Animal> */
	protected List<Animal> animaux = new ArrayList<>();
	
	/** Représente le type de la Zone.
	 * @return ZoneZoo
	 */
	public abstract ZoneZoo getZoneZoo();

	/**
	 * Ajoute un animal
	 * 
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	/**
	 * Affiche la liste des animaux dans la zone
	 */
	public void afficherListeAnimaux() {
		animaux.stream().forEach(Animal::toString);
	}

	/**
	 * Donne le nombre d'animaux dans la zone
	 * 
	 * @return int
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	/**
	 * Donne la quantité de nourriture consommée dans la zone en kgs
	 * 
	 * @return double
	 */
	public abstract double calculerKgsNourritureParJour();
}