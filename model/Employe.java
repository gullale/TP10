package model;

public class Employe {

	private String nom;
	private String prenom;
	private int id;

	public Employe(String pnom, String pprenom, int pid) {
		this.nom = pnom;
		this.prenom = pprenom;
		this.id = pid;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void demanderFormation(String theme) {
		
	}
}
