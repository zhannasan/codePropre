package ex3.corrige3;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;

import ex3.corrige3.animaux.Animal;
import ex3.corrige3.zones.Aquarium;
import ex3.corrige3.zones.FermeReptile;
import ex3.corrige3.zones.SavaneAfricaine;
import ex3.corrige3.zones.TypeZone;
import ex3.corrige3.zones.Zone;
import ex3.corrige3.zones.ZoneCarnivore;

/** Représente un Zoo avec son nom et ses différentes zones (gérées sous forme de Map avec un Type)
 * @author DIGINAMIC
 */
public class Zoo {

	/** nom : String */
	private String nom;
	
	/** zones : EnumMap<String,Zone> */
	private EnumMap<TypeZone, Zone> zones = new EnumMap<>(TypeZone.class);

	/**
	 * Constructeur
	 * 
	 * @param nom nom du Zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
		zones.put(TypeZone.ZONE_CARNIVORE, new ZoneCarnivore());
		zones.put(TypeZone.AQUARIUM, new Aquarium());
		zones.put(TypeZone.FERME_REPTILE, new FermeReptile());
		zones.put(TypeZone.SAVANE_AFRICAINE, new SavaneAfricaine());
	}

	/**
	 * Ajoute un animal au zoo
	 * 
	 * @param animal animal
	 */
	public void addAnimal(Animal animal) {
		if (animal==null){
			return;
		}
		zones.values().stream().forEach(zone -> checkZoneForAnimal(zone, animal));
	}
	
	/** Vérifie si une zone accepte un animal ou non
	 * @param zone zone
	 * @param animal animal
	 */
	private void checkZoneForAnimal(Zone zone, Animal animal){
		if (zone.acceptAnimal(animal)){
			zone.addAnimal(animal);
		}
	}
	
	/** Retourne une {@link Zone} en fonction du type {@link TypeZone} passé en paramètre
	 * @param type type de zone
	 * @return {@link Zone}
	 */
	public Zone getZoneByType(TypeZone type){
		return zones.get(type);
	}
	
	/** Retourne la liste des zones du zoo
	 * @return {@link Collection} of {@link Zone}
	 */
	public Collection<Zone> getZones(){
		return Collections.unmodifiableCollection(zones.values());
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

	/** Compte tous les animaux du Zoo
	 * @return int
	 */
	public int compterAnimaux() {
		
		int somme = 0;
		for (Zone zone: getZones()){
			somme+=zone.compterAnimaux();
		}
		return somme;
	}
}