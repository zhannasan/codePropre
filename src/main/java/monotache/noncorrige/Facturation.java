package monotache.noncorrige;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Facturation {

	public Facture creerFacture(double montant, String dateFactureStr){
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date dateFacture = null;
		try {
			dateFacture = formatter.parse(dateFactureStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Facture facture = new Facture();
		facture.setDateFacture(dateFacture);
		facture.setMontant(montant);
		
		return facture;
	}
}
