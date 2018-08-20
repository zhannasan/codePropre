package ex3.corrige3;

import ex3.corrige3.animaux.Mammifere;
import ex3.corrige3.animaux.Poisson;
import ex3.corrige3.animaux.Reptile;

/** Classe qui créée un Zoo et y place des animaux
 * @author DIGINAMIC
 */
public class ZooApplication {

	/** Point d'entrée 
	 * @param args paramètres non utilisés dans cette application
	 */
	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Mammifere("Zèbre", Comportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Lion", Comportement.CARNIVORE));
		zoo.addAnimal(new Mammifere("Panthère", Comportement.CARNIVORE));
		zoo.addAnimal(new Poisson("Requin blanc", Comportement.CARNIVORE ));
		zoo.addAnimal(new Poisson("Truite dorée", Comportement.HERBIVORE));
		zoo.addAnimal(new Reptile("Boa constrictor", Comportement.CARNIVORE));
		zoo.addAnimal(new Reptile("Python", Comportement.CARNIVORE));

		zoo.afficherListeAnimaux();
	}

}