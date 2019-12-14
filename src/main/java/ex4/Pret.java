package ex4;

import java.util.Date;

public class Pret extends PretATerme{
	private Date dateDebut;
	private Date dateFin;
	
	/**
	 * @param capital
	 * @param capitalRestantDu
	 * @param taux
	 * @param dateDebut
	 * @param dateFin
	 */
	public Pret(double capital, double capitalRestantDu, double taux, Date dateDebut, Date dateFin) {
		super(capital, capitalRestantDu, taux);
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	/** Getter for dateDebut
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/** Setter
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/** Getter for dateFin
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
}
