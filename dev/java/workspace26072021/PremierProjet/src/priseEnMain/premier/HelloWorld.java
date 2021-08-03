package priseEnMain.premier;
//import static java.lang.System.out;

public class HelloWorld {
	public static void main (String[] args) {
		System.out.println("Hello World");
		
		double c = 3.3/9;
		double d = 1.1/3;
		float e = 1.1f/3;
		double f = 1.1f/3;
		
		if(c == d)	
			System.out.println("YES c = d    "+c+" = "+d);
		else
			System.out.println("NON c != d   "+c+" != "+d);
		
		if(e == f)	
			System.out.println("YES e = f    "+e+" = "+f);
		else
			System.out.println("NON e! = f   "+e+" != "+f);
		
		if(d == f)	
			System.out.println("YES d = f   "+d+" = "+f);
		else
			System.out.println("NON d != f   "+d+" != "+f);

		

	}
}
