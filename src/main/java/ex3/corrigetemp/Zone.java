package ex3.corrigetemp;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {

	protected List<Animal> animaux;
	
	public Zone(){
		this.animaux = new ArrayList<>();
	}
	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.getNom());
		}
	}
	
	public final int compterAnimaux() {
		return animaux.size();
	}
	
	public abstract double calculerKgsNourritureParJour();
}
