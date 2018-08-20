package ex3.corrige2;

import java.util.ArrayList;
import java.util.List;

/** Repésente un zoo
 * @author DIGINAMIC
 */
public class Zoo {

	/** nom : String */
	private String nom;
	/** zones : Map<String,Zone> */
	private List<Zone> zones = new ArrayList<>();

	/**
	 * Constructeur
	 * 
	 * @param nom nom du Zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		zones.add(new ZoneCarnivore());
		zones.add(new Aquarium());
		zones.add(new FermeReptile());
		zones.add(new SavaneAfricaine());

	}

	/**
	 * Ajoute un animal au zoo
	 * 
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		for (Zone zone: zones){
			if (zone.verifierHebergementAnimal(animal)){
				zone.addAnimal(animal);
			}
		}
	}

	/**
	 * Affiche la liste des animaux du zoo
	 */
	public void afficherListeAnimaux() {
		zones.stream().forEach(Zone::afficherListeAnimaux);
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}