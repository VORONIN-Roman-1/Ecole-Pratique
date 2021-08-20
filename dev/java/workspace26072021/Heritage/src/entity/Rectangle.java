package entity;

public class Rectangle extends Figure {
	private int hauteur;
	private int largeur;

	@Override
	public int culculeSurface() {

		return hauteur * largeur;
	}

	public Rectangle(String nom, int hauteur, int largeur) {
		super(nom);
		this.hauteur = hauteur;
		this.largeur = largeur;
	}

	public Rectangle(String nom) {
		super(nom);
	}

	public Rectangle() {
		super();
	}
	

}
