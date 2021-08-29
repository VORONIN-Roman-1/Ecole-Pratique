package entity;

public abstract class Figure {
	public String nom;
	
	public Figure(String nom) {
		this.nom = nom;
	}

	public Figure() {
	}

	public abstract int culculeSurface();
}
