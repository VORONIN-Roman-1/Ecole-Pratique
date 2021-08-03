import static java.lang.System.out;
import java.io.PrintStream;

public class StringCllass{
	public static void main (String[] args ){
		PrintStream print = out;
		
		int age = 10;
		String bonjour= "Bonjour";
		String bonjour1= "Bonjour"; 
		String bonjour2= new String ("Bonjour"); 
		if (bonjour==bonjour1) 
			print.println("YES bonjour==bonjour1");
		else
			print.println("NO bonjour==bonjour1");
		if (bonjour==bonjour2) 
			print.print("YES bonjour==bonjour2");
		else
			print.print("NO bonjour==bonjour2");
		String s="Je m'appelle Toto et j'ai " + age + " age.\n";
		
		print.print(s);
		
		/**print.print("Je m'appelle Toto et j'ai ");
		print.print( age );
		print.print(" age.");*/

			

	}
}