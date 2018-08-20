package ex3.corrige1;

import java.util.HashMap;
import java.util.Map;

/** Représente un Zoo avec son nom et ses différentes zones
 * @author DIGINAMIC
 */
public class Zoo {

	/** nom : String */
	private String nom;
	/** zones : Map<String,Zone> */
	private Map<String, Zone> zones = new HashMap<>();

	/**
	 * Constructeur
	 * 
	 * @param nom nom du Zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		zones.put(ZoneZoo.ZONE_CARNIVORE.getNom(), new ZoneCarnivore());
		zones.put(ZoneZoo.AQUARIUM.getNom(), new Aquarium());
		zones.put(ZoneZoo.FERME_REPTILE.getNom(), new FermeReptile());
		zones.put(ZoneZoo.SAVANE_AFRICAINE.getNom(), new SavaneAfricaine());
	}

	/**
	 * Ajoute un animal au zoo
	 * 
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		
		for (Zone zone: zones.values()){
			if (zone.getZoneZoo().equals(animal.getZoneZoo())){
				zone.addAnimal(animal);
			}
		}
	}

	/**
	 * Affiche la liste des animaux du zoo
	 */
	public void afficherListeAnimaux() {
		zones.values().stream().forEach(Zone::afficherListeAnimaux);
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