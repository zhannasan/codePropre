package ex3.corrige2;

import java.util.ArrayList;
import java.util.List;

/** Représente une zone du zoo
 * @author DIGINAMIC
 */
public abstract class Zone {
	
	/** animaux : List<Animal> */
	protected List<Animal> animaux = new ArrayList<>();

	/** Vérifie si l'animal peut être hébergé dans cette zone ou non
	 * @param animal animal
	 * @return boolean
	 */
	public abstract boolean verifierHebergementAnimal(Animal animal);
	
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
	 * Donne la quantité de nourriture consommée dans la zone
	 * 
	 * @return double
	 */
	public abstract double calculerKgsNourritureParJour();
}