package entity;

public class Chien extends Animal{
	private String couleurBalle;
	public Chien(String couleurBalle) {
		super();
		this.couleurBalle = couleurBalle;
	}

	public Chien() {
		super();
	}
	
	public void rapporterBalle() {
		System.out.println("j'apporte la balle "+ couleurBalle);
	}
	
	
	
	@Override
	public void manger() {
		System.out.println("Je mange balle "+ couleurBalle );
	}

	@Override
	public void crier() {
		System.out.println("Wouf");
	}

	@Override
	public void presentation() {
			super.presentation();
			System.out.println(" et je suis en chien" );
			 
	}

	public String getCouleurBalle() {
		return couleurBalle;
	}

	public void setCouleurBalle(String couleurBalle) {
		this.couleurBalle = couleurBalle;
	}
	
}
