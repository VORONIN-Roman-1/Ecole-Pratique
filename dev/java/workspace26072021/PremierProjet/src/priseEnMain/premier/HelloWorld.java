package priseEnMain.premier;

public class HelloWorld {
	public static void main (String[] args) {
		System.out.println("Hello World");
		double c = 3.3/9;
		double d = 1.1/3;
		if(c == d)	
			System.out.println("YES "+c+" = "+d);
		else
			System.out.println("NON "+c+" != "+d);
		int a = 3;
		int b = 4;
		boolean b1 = 1 > 2;
		boolean b2 = a <= 3;
		boolean b3 = a == b;
		boolean b4 = 5 != b;
		boolean b5 = 2 > a;
		boolean b6 = a >= b;
		System.out.println("La valeur de b1 est : "+b1);
		System.out.println("La valeur de b2 est : "+b2);
		System.out.println("La valeur de b3 est : "+b3);
		System.out.println("La valeur de b4 est : "+b4);
		System.out.println("La valeur de b5 est : "+b5);
		System.out.println("La valeur de b6 est : "+b6);
		System.out.println();
		String str1="oui";
		String str2="oui";
		b1=str1==str2;
		b2= str1.equals(str2);
		b3 = str1.equals("oui");
		b4 = str1.equals("non");
		System.out.println("La valeur de b1 est : "+b1);
		System.out.println("La valeur de b2 est : "+b2);
		System.out.println("La valeur de b3 est : "+b3);
		System.out.println("La valeur de b4 est : "+b4);
		int x=4; {
			x=5;
			int y=5;
		}
		
		System.out.println(x);
	}
}
