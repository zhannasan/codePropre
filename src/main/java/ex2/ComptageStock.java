package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComptageStock {

	private int nb;
	private int resultat;
	private Date dateDebutComptage;
	private String dateFinComptage;
	private String type;
	
	public void ajouterElement(int montant){
		nb++;
		resultat +=montant;
	}
	
	public void afficheStatutComptage(){
		
		if (type!=null && type.equals("SOM")){
			System.out.println("Ce comptage est de type SOMME");
			System.out.println("Nombre d'élements "+nb);
			
			System.out.println("Résultat "+resultat);
		}
		else if (type!=null && type.equals("MOY")){
			System.out.println("Ce compte est de type MOYENNE");
			System.out.println("Nombre d'élements "+nb);
			
			System.out.println("Résultat "+resultat/nb);
		}
		
		if (dateDebutComptage!=null){
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println(f.format(dateDebutComptage));
		}
		
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le "+dateFinComptage);
			if (nb==0){
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			}
			else {
				System.out.println("Le comptage est clos et est OK.");
			}
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}
	
	public Date getDateFinComptage(){
		SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if (dateFinComptage!=null){
			try {
				return ff.parse(dateFinComptage);
			} catch (ParseException e) {
				return null;
			}
		}
		return null;
	}
}
