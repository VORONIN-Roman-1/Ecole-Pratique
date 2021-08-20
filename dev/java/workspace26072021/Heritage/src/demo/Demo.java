package demo;

import entity.Carre;
import entity.Figure;
import entity.Rectangle;

public class Demo {

	public static void main(String[] args) {
		Carre carre = new Carre();
		Figure carre2 = new Carre();
		carre.cote = 3;
		Figure figure= carre;
		Rectangle rectangle = new Rectangle("Rex", 4, 5);
				figure= rectangle;
		System.out.println(figure.culculeSurface());
	}
}
