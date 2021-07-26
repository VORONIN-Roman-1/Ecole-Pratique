package priseEnMain.premier;
import static java.lang.System.out;
import java.io.PrintStream;

public class HelloWorld {
	
	public static void main (String[] args) {
		PrintStream p = out;
		int x=3, y=-3;
		if (x<0 || y<0)	p.println("Exists negative");
		else p.print("ALL positive or 0");
		if ( y!=0 && x/y>1)	p.println("YES");
		else p.println("NON");
	}
}
