package entity;

public class Carre implements ISurfaceCalculable, IPerimetreCalculable {
	public int cote;

	@Override
	public int calculSurface() {
		
		return cote*cote;
	}

	@Override
	public int calculPerimetre() {
		// TODO Auto-generated method stub
		return 4*cote;
	}
}
