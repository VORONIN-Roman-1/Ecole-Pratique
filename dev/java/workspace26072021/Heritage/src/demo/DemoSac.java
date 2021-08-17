package demo;

import entity.SacMain;

public class DemoSac {

	public static void main(String[] args) {
		SacMain sacAMain = new SacMain();
		
		sacAMain.setVolume(200);
		sacAMain.setMatiere("similicuir");
		sacAMain.setCouleur("vert");
		sacAMain.setPrix(59.99f);
		
		System.out.println("La matière est :" + sacAMain.getMatiere());
		System.out.println("La couleur est :" + sacAMain.getCouleur());
		
		sacAMain.contenir();
		sacAMain.decorer();
	}

}
