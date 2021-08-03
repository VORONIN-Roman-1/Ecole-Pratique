package exo;

import util.Recup;

public class TableauFor {
	public static void main(String[] args) {
		int m[]= new int[8];
		for (int i=0;i<m.length; i++ ) {
			m[i]=3;
		}

		for (int i :m) {
	
			System.out.print(i+" ");
			
		}
		System.out.print("\n");
		String s[] = new String [5];
		for (int i=0;i<5;i++) {
			System.out.println("Donne mot numero "+(i+1));
			s[i]=Recup.s();
		}
		for (String i :s) {
			
			System.out.print(i+" ");
			
		}
	}
}
