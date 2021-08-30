package entity;

public class Rectangle implements ISurfaceCalculable {
	public int hauteur;
	public int largeur;
	@Override
	public int calculSurface() {
		return hauteur*largeur;
	}
}
