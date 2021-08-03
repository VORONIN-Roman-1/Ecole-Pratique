package priseEnMain.premier;

import util.Recup;

public class DixVin {
	 public static void main (String [ ]args) {
		 int nombre = 0;
		 while (nombre<10 || nombre>20) {
			 System.out.println("Nombre entre 10et 20 stp");
			  nombre=Recup.entier();
			 
			 if (nombre<10)				 System.out.println("Plus grand!");
			 if (nombre>20)				 System.out.println("Plus petit!");
		 }
		 System.out.println("BRAVO!");
	 }
}
