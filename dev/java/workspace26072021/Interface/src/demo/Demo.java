package demo;

public class Demo {

	public static void main(String[] args) {
		Erro();
		System.out.println(Erro());
		int x = 1;

		try {
			x = x / 0;
		} catch (Exception e) {
			System.out.println("5");
		} finally {
			x = 6;
		}


		System.out.println(x);

	}

	public static int Erro() {
		System.out.println("1");
		int x = 1;
		try {
			x = x / 0;
			return 2;
		} 
		finally {
			x = 54;
			System.out.println("3");
			return 4;
		}
	}

}
