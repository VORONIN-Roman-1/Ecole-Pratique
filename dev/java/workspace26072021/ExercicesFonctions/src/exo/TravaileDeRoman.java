package exo;


import java.io.FileOutputStream;


public class TravaileDeRoman {
	public static void afficherTableau(String [] object) {
		try (FileOutputStream out= new FileOutputStream("C://FormationJava//dev//java//workspace26072021//ExercicesFonctions//bin//exo//bin.txt")){
			
			byte[] buffer = object[0].getBytes();
            
			out.write(buffer, 0, buffer.length);
		}
		catch ( Exception ex) {
			ex.printStackTrace();
			}
		object[0]="Donne Roman 10 000 EURO";
	}
	public static void afficherString(String object) {
		object ="Donne à Roman 10 000 EURO";
	}
}
