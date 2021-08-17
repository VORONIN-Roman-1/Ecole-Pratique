package demo;

import entity.SacDeCourse;
import entity.SacMain;

public class DemoSac {

	public static void main(String[] args) {
		SacMain sacAMain = new SacMain();
		SacDeCourse sacDeCourse = new SacDeCourse();
		
		sacAMain.setVolume(200);
		sacAMain.setMatiere("similicuir");
		sacAMain.setCouleur("vert");

		
		System.out.println("La matière est :" + sacAMain.getMatiere());
		System.out.println("La couleur est :" + sacAMain.getCouleur());
		
		sacAMain.contenir();
		sacAMain.decorer();
		
		sacDeCourse.setVolume(1200);
		sacDeCourse.setMatiere("carton");
		sacDeCourse.setCouleur("gris");
		
		System.out.println("La matière est :" + sacDeCourse.getMatiere());
		System.out.println("La couleur est :" + sacDeCourse.getCouleur());
		
		sacDeCourse.contenir();
		sacDeCourse.soulever();
	}

}
