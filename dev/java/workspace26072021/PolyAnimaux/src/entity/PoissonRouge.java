package entity;

public class PoissonRouge extends Animal {

	protected int surfaceBocal;
	
	public int getSurfaceBocal() {
		return surfaceBocal;
	}
	
	public void setSurfaceBocal(int surface) {
		surfaceBocal = surface;
	}
	
	public void faireDesBulles() {
		System.out.println("Et je bulle");
	}
	
	public void crier() {
		System.out.println("blou blou");
	}

	@Override
	public void presentation() {
		super.presentation();
		System.out.println(" et je suis en Poisson Rouge" );
	}
}
