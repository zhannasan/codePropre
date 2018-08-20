package ex3.corrige1;

/** Classe qui créée un Zoo et y place des animaux
 * @author DIGINAMIC
 */
public class ZooApplication {

	/** Point d'entrée 
	 * @param args paramètres non utilisés dans cette application
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Animal("Zèbre", Comportement.HERBIVORE, Type.MAMMIFERE, ZoneZoo.SAVANE_AFRICAINE));
		zoo.addAnimal(new Animal("Lion", Comportement.CARNIVORE, Type.MAMMIFERE, ZoneZoo.ZONE_CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", Comportement.CARNIVORE, Type.MAMMIFERE, ZoneZoo.ZONE_CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", Comportement.CARNIVORE, Type.POISSON, ZoneZoo.AQUARIUM));
		zoo.addAnimal(new Animal("Truite dorée", Comportement.HERBIVORE, Type.POISSON, ZoneZoo.AQUARIUM));
		zoo.addAnimal(new Animal("Boa constrictor", Comportement.CARNIVORE, Type.REPTILE, ZoneZoo.FERME_REPTILE));
		zoo.addAnimal(new Animal("Python", Comportement.CARNIVORE, Type.REPTILE, ZoneZoo.FERME_REPTILE));

		zoo.afficherListeAnimaux();
	}

}