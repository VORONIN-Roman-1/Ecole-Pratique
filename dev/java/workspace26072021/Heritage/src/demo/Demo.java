package demo;

import entity.Carre;
import entity.Figure;

public class Demo {

	public static void main(String[] args) {
		Carre carre = new Carre();
		Figure carre2 = new Carre();
		carre.cote = 3;
		Figure figure= carre;
	}
}
