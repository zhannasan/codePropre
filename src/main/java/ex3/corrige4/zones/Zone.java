package ex3.corrige4.zones;

import java.util.ArrayList;
import java.util.List;

import ex3.corrige3.animaux.Animal;

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
	public abstract boolean acceptAnimal(Animal animal);
	
	/**
	 * Donne la masse moyenne de nourriture consommée par animal
	 * @return double
	 */
	public abstract double getMasse();
	
	/**
	 * Donne la masse moyenne de nourriture consommée dans toute la zone
	 * @return double
	 */
	public final double calculerKgsNourritureParJour() {
		return animaux.size() * getMasse();
	}
	
	
	/**
	 * Ajoute un animal
	 * 
	 * @param animal
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
	 * @return
	 */
	public int compterAnimaux() {
		return animaux.size();
	}

	
	/** Getter for animaux
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/** Setter
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
}