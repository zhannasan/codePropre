package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Comptage {

	private int solde;
	private String mom;
	private String prenom;
	private Date dateOuverture;
	private String dateFermeture;
	private String type;
	private float tauxRemuneration;
	
	public static final int plafondDecouvert = -3000;
	
	public void affichetStatut(){
		
		if (type!=null && type.equals("CC")){
			System.out.println("Ce compte est un compte courant");
		}
		else if (type!=null && type.equals("LA")){
			System.out.println("Ce compte est un Livret A");
			System.out.println("Le taux de rémunération du compte est "+tauxRemuneration);
		}
		
		if (dateOuverture!=null){
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println(formatter.format(dateOuverture));
		}
		
		if (solde < plafondDecouvert){
			System.out.println("Le compte est à découvert");
		}
		else {
			System.out.println("Le compte n'est pas à découvert");
		}
		
		if (dateFermeture!=null){
			System.out.println("Le compte est fermé depuis le ");
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}
	
	public Date getDateFermeture(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if (dateFermeture!=null){
			try {
				return formatter.parse(dateFermeture);
			} catch (ParseException e) {
				return null;
			}
		}
		return null;
	}
}
