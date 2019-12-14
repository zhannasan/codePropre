package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE",20));
		zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE",300));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "HERBIVORE",190));
		zoo.addAnimal(new Animal("Panthère", "MAMMIFERE", "CARNIVORE",18));
		zoo.addAnimal(new Animal("Requin blanc", "POISSON", "HERBIVORE",800));
		zoo.addAnimal(new Animal("Truite dorée", "POISSON", "HERBIVORE",5));
		zoo.addAnimal(new Animal("Boa constrictor", "REPTILE", "CARNIVORE",12));
		zoo.addAnimal(new Animal("Python", "REPTILE", "CARNIVORE",120));
		
		zoo.afficherListeAnimaux();
		
	}

}
