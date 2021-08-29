package entity;

public class Carre extends Figure {
	public int cote;
	
	public Carre(String nom, int cote) {
		super(nom);
		this.cote = cote;
	}
	

	public Carre(String nom) {
		super(nom);
	}


	public Carre() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int culculeSurface() {
		return cote*cote;
	}
	
}
