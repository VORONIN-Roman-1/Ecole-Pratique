package demo;

public class Demo1 {
	public static void main (String[] args) {
		
		afficheSalutations();
		afficheSalutationsPersonnalise("Roman");
		int v=5;
		byte b=6;
		test (b);
		test (v);
		
	}
	public static void afficheSalutations() {
		System.out.println("Bonjour tout le monde !");
	}
	public static void afficheSalutationsPersonnalise(String s) {
		System.out.println("Bonjour "+s);
	}
	public static void test(double v) {
		System.out.println("Double "+v);
	}
	public static void test(float v) {
		System.out.println("Float "+v);
	}
	public static void test(byte v) {
		System.out.println("Byte "+v);
		
	}
}
