package model;

public class DemanderFormation {

	private String dateFin;
	private String etatValidation;
	private String dateDemande;
	private String dateDebut;

	// Constante
	// public final static String ETATINITIAL = "Initial";

	public DemanderFormation(String dateFin, String dateDemande, String dateDebut) {

		this.dateFin = dateFin;
		this.dateDemande = dateDemande;
		this.dateDebut = dateDebut;
		this.etatValidation = "Initial";

	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtatValidation() {
		return etatValidation;
	}

	public void setEtatValidation(String etatValidation) {
		this.etatValidation = etatValidation;
	}

	public String getDateDemande() {
		return dateDemande;
	}

	public void setDateDemande(String dateDemande) {
		this.dateDemande = dateDemande;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

}
