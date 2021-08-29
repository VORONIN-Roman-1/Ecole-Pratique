package entity;

public class Etudiant {
	private String nom;
	private int note1;
	private int note2;
	public Etudiant(String nom, int note1, int note2) {
		this.nom = nom;
		this.note1 = note1;
		this.note2 = note2;
	}
	public double calculeMoyenne() {
		return (note1+note2)/2.0;
	}
	public void show () {
		System.out.println(nom+ " a la note moyenne :"+ calculeMoyenne());
	}
	
}
