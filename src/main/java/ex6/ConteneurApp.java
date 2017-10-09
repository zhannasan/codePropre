package ex6;

public class ConteneurApp {

	public static void main(String[] args) {
		Conteneur conteneur = new Conteneur();
		conteneur.add("un");
		conteneur.add("deux");
		conteneur.add("trois");
		conteneur.add("quatre");
		conteneur.add("cinq");
		
		for (int i=0; i<conteneur.getSize(); i++){
			System.out.println(conteneur.getContent(i));
		}
	}

}
