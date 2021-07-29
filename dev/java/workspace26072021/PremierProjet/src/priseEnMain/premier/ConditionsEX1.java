package priseEnMain.premier;
import static java.lang.System.out;

import java.io.IOException;
import java.io.PrintStream;
public class ConditionsEX1 {
	public static void main (String[] args) {
		PrintStream p = out;

		char  ch;
		try {
			ch = (char) System.in.read();
			p.println(ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				int age=7;
		System.out.println((age==6)? "Poussin": (age==7)? "Benjamin":(age==8)? "Cadet":"Adolescent");
		
	}
}
