package priseEnMain.premier;
import util.Recup;
public class HelloRecup {
	public static void main (String[] args) {
		int ch= Recup.c();
		int ch1= Recup.c();
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println("Comment vous appelez-vous?");
		String nome= Recup.s();
		System.out.println("Bonjour "+nome);
		System.out.println("Donne moi un entier");
		int number =Recup.i();
		System.out.println("Son double est: "+ number*2);
	}
}
