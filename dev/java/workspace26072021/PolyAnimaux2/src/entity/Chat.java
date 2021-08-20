package entity;

public class Chat extends Animal {

	protected String couleurCollier;
	
	public String getCouleurCollier() {
		return couleurCollier;
	}
	
	public void setCouleurCollier(String couleurCollier) {
		this.couleurCollier = couleurCollier;
	}
	
	public void griffer() {
		System.out.println("Je griffe");
	}
	
	public void crier() {
		System.out.println("Miaou");
	}

	@Override
	public void presentation() {
		super.presentation();
		System.out.println(" et je suis en chat" );
	}
	
}
