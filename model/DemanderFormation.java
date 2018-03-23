package model;

public class DemanderFormation {

	private String theme;
	private String etatValidation;
	private String dateDemande;

	public DemanderFormation(String theme, String etatValidation, String dateDemande) {
		this.theme = theme;
		this.etatValidation = etatValidation;
		this.dateDemande = dateDemande;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
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

}
