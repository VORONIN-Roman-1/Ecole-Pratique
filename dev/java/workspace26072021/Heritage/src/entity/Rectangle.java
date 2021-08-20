package entity;

public class Rectangle extends Figure {
	private int hauteur;
	private int largeur;

	@Override
	public int culculeSurface() {

		return hauteur * largeur;
	}

}
