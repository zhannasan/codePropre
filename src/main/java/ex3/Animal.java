package ex3;

public class Animal {
	private String typeAnimal;
	private String nomAnimal; 
	private String comportement;
	private double size;
	ZoneZoo zone;
	/**
	 * @param typeAnimal type d'animal
	 * @param nomAnimal nom d'animal
	 * @param comportement comportement d'animal
	 * @param size le poids d'animal
	 */
	public Animal( String nomAnimal, String typeAnimal, String comportement, double size) {
		super();
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		this.comportement = comportement;
		this.size = size;
	}
	/**
	 * @return the typeAnimal
	 */
	public String getTypeAnimal() {
		return typeAnimal;
	}
	/**
	 * @param typeAnimal the typeAnimal to set
	 */
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	/**
	 * @return the nomAnimal
	 */
	public String getNomAnimal() {
		return nomAnimal;
	}
	/**
	 * @param nomAnimal the nomAnimal to set
	 */
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	/**
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}
	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
	
	public String toString(){
		return this.nomAnimal+" "+this.typeAnimal+" "+this.comportement+" "+this.size+"kg";
	}
	
	/**
	 * @return calcul de la nourriture par jour selon animal
	 */
	public double calculerKgsNourritureParJour(){
		if(zone.getZone()!=null &&zone.getZone().equalsIgnoreCase("Aquarium")){
			return getSize()*2;
		}
		return getSize() * 10;
	}
}
