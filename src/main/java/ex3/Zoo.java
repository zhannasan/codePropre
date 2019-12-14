package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	/**nom - nom de zoo
	 * 
	 */
	private String nom;

	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	private FermeReptile fermeReptile = new FermeReptile();
	private Aquarium aquarium = new Aquarium();

	
	/**
	 * @param nom constructeur de zoo avec un parametre nom
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * @param animal designer l'animal a la zone correspondante 
	 */
	public void addAnimal(Animal animal) {
		if (animal.getTypeAnimal().equalsIgnoreCase("MAMMIFERE")
				&& animal.getComportement().equalsIgnoreCase("CARNIVORE")) {
			zoneCarnivore.addAnimal(animal);
		} else if (animal.getTypeAnimal().equalsIgnoreCase("MAMMIFERE")
				&& animal.getComportement().equalsIgnoreCase("HERBIVORE")) {
			savaneAfricaine.addAnimal(animal);
		} else if (animal.getTypeAnimal().equalsIgnoreCase("REPTILE")) {
			fermeReptile.addAnimal(animal);
		} else if (animal.getTypeAnimal().equalsIgnoreCase("POISSON")) {
			aquarium.addAnimal(animal);
		}
	}

	/**afficher les animaux selon leur zones dans le zoo
	 * 
	 */
	public void afficherListeAnimaux() {
		System.out.println("Zoo "+this.nom);
		if (zoneCarnivore != null) {
			System.out.println("Zone Carnivore :");
			zoneCarnivore.afficherListeAnimaux();
		}
		if (savaneAfricaine != null) {
			System.out.println("\rSavane Africaine :");
			savaneAfricaine.afficherListeAnimaux();
		}
		if (fermeReptile != null) {
			System.out.println("\rFerme Reptile :");
			fermeReptile.afficherListeAnimaux();
		}
		if (aquarium != null) {
			System.out.println("\rAquarium :");
			aquarium.afficherListeAnimaux();

		}
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
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
