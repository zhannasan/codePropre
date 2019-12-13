package ex3;

import java.util.List;

public abstract class ZoneZoo {
	private List<Animal> animals;
	Animal animal;
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	public void afficherListeAnimaux(){
		for (Animal a: animals){
			System.out.println(a.getNomAnimal()+" "+a.getComportement()+" "+a.getSize()+" "+a.getTypeAnimal());
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animal.getSize() * 10;
	}
	
	public void afficherComportement(){
		for (Animal a: animals){
			System.out.println(a.getComportement());
		}
	}
	
	public void afficherType(){
		for (Animal a: animals){
			System.out.println(a.getTypeAnimal());
		}
	}
}
