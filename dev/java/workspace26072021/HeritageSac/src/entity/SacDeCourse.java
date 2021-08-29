package entity;

public class SacDeCourse extends Sac {

	public void soulever() {
		System.out.println("Je soulève à fond tout ce qu'il y à l'intérieur");
	}

	public SacDeCourse() {
		super();
	}

	public SacDeCourse(int volume, String matiere, String couleur) {
		super(volume, matiere, couleur);
	}
	
}
