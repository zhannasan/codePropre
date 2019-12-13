package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	/*private List<Animal> savaneAfricaine;
	private List<Animal> zoneCarnivore;
	private List<Animal> fermeReptile;
	private List<Animal> aquarium;
*/
	List<ZoneZoo> zoo = new ArrayList<>();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	
	public void addAnimal(Animal animal){
		List<Animal> zoneCarnivore = new ArrayList<>();
		List<Animal> fermeReptile = new ArrayList<>();
		List<Animal> aquarium = new ArrayList<>();
		if (animal.getTypeAnimal().equalsIgnoreCase("MAMMIFERE") && animal.getComportement().equalsIgnoreCase("CARNIVORE")){
			zoneCarnivore.add(animal);
		}
		else if (animal.getTypeAnimal().equalsIgnoreCase("MAMMIFERE") && animal.getComportement().equalsIgnoreCase("HERBIVORE")){
			savaneAfricaine.add(animal);
		}
		else if (animal.getTypeAnimal().equalsIgnoreCase("REPTILE")){
			fermeReptile.add(animal);
		}
		else if (animal.getTypeAnimal().equalsIgnoreCase("POISSON")){
			aquarium.add(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		
		System.out.println();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
