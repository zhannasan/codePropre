package monotache.corrige;

import java.util.Date;

public class Facturation {

	public Facture creerFacture(double montant, Date dateFacture){
		
		Facture facture = new Facture();
		facture.setDateFacture(dateFacture);
		facture.setMontant(montant);
		
		return facture;
	}
}
