import static java.lang.System.out;
import java.io.PrintStream;

public class HelloWorld{
	public static void main (String[] args ){
		PrintStream print = out;
		
		int age = 10;
		String s="Je m'appelle Toto et j'ai " + age + " age.\n";
		
		print.print(s);
		


			

	}
}