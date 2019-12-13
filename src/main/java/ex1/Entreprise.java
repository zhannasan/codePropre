package ex1;

import java.util.Date;
/**
 * Classe qui affiche le statut d'entreprise
 * @author DIGINAMIC
 */
public class Entreprise {
	private int siret;
	private String nom;
	private String adresse;
	private Date dateCreation;
	
	public static final int capitalMax = 3_000_000;
	
	/**
	 * @param siret SIRET de l'entreprise
	 * @param nom Nom de de l'entreprise
	 * @param adresse Adresse de l'entreprise
	 * @param dateCreation date de création de l'entreprise
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @return the capitalmax
	 */
	public static int getCapitalmax() {
		return capitalMax;
	}

	/**Methode qui affiche nom, adresse, siret et date de creation de l'entreprise
	 * 
	 */
	public void afficherStatut(){
		System.out.println("Nom : "+nom+"\rSiret N"+siret+"\rAdresse : "+adresse+
				"\rDate de création : "+dateCreation+"\rCapital maximal : "+capitalMax+"\u20AC");
	}
	
}
