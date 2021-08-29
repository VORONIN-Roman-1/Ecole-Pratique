package demo;

import entity.SacAMain;
import entity.SacAMainLongchamp;
import entity.SacDeCourse;

public class DemoSac {

	public static void main(String[] args) {
		
		
		
		System.out.println("Sac à main");
		System.out.println("----------");
		
		SacAMain sacAMain = new SacAMain(); 
		
		sacAMain.setVolume(200);
		sacAMain.setMatiere("similicuir");
		sacAMain.setCouleur("vert");
		sacAMain.setPrix(59.99f);
		
		System.out.println("La matière est : " + sacAMain.getMatiere());
		System.out.println("La couleur est : " + sacAMain.getCouleur());
		System.out.println("Le volume est : " + sacAMain.getVolume());
		System.out.println("Le prix est : " + sacAMain.getPrix() + "e");

		
		sacAMain.contenir();
		sacAMain.decorer();
 

		System.out.println();
		System.out.println("Sac de course");
		System.out.println("-------------");
		
		SacDeCourse sacDeCourse = new SacDeCourse(); 
		
		sacDeCourse.setVolume(200);
		sacDeCourse.setMatiere("papier");
		sacDeCourse.setCouleur("marron");

		
		System.out.println("La matière est : " + sacDeCourse.getMatiere());
		System.out.println("La couleur est : " + sacDeCourse.getCouleur());
		System.out.println("Le volume est : " + sacDeCourse.getVolume());

		
		sacDeCourse.contenir();
		sacDeCourse.soulever();
		
		System.out.println();
		System.out.println("Sac à main construit"); 
		System.out.println("--------------------");
		
		SacAMain sacAMainConstruit = new SacAMain(260, "cuir", "orange", 5000);
		System.out.println("Le volume est : "  + sacAMainConstruit.getVolume());
		System.out.println("La matière est : " + sacAMainConstruit.getMatiere());
		System.out.println("La couleur est : " + sacAMainConstruit.getCouleur());
		System.out.println("Le prix est : "    + sacAMainConstruit.getPrix());
		
		System.out.println("Sac coures construit"); 
		System.out.println("--------------------");
		
		SacDeCourse sacDeCourseConsruit = new SacDeCourse(500, "carton", "belge");
		System.out.println("Le volume est : "  + sacDeCourseConsruit.getVolume());
		System.out.println("La matière est : " + sacDeCourseConsruit.getMatiere());
		System.out.println("La couleur est : " + sacDeCourseConsruit.getCouleur());
		

		System.out.println("Sac à main SacAMainLongchamp"); 
		System.out.println("--------------------");
		SacAMainLongchamp sacAMainLongchamp= new SacAMainLongchamp();
		sacAMainLongchamp.setTailleLogo(10);
		sacAMainLongchamp.setMatiereSecondaire("Or");
		sacAMainLongchamp.setPrix(2000);
		sacAMainLongchamp.setVolume(10);
		sacAMainLongchamp.setCouleur("Bleu");
		sacAMainLongchamp.setMatiere("similicuir");
		
		System.out.println("Le rix est : "  + sacAMainLongchamp.getPrix());
		System.out.println("La taille du logo est : " + sacAMainLongchamp.getTailleLogo());
		
		SacAMainLongchamp sacAMainLongchamp2= new SacAMainLongchamp(50, "cuir", "rouge", 2500f, 30, "");
		Object object = new Object();
	}

}
