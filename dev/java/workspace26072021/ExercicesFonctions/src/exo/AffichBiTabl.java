package exo;

public class AffichBiTabl {
	public static void main(String[] args) {
		
		//EX1
		System.out.println(" EX1 ");
		int m[][]= {{2,3,4},
					{3,8,4}};
		for(int x[]:m) {
			for (int y : x)
				System.out.print(y+" ");
			System.out.println("");
		}
		System.out.println("====================================");
		//Ex2
		System.out.println(" EX2 ");
		int min= m[0][0];
		int max= m[0][0];
		int somme=0;
		double moyenne=0.0;
		for(int x[]:m) {
			for (int y : x) {
				min=min<y?min:y;
				max=max>y?max:y;
				somme+=y;
			}
		}
		
		moyenne=(double)somme/(m.length*m[0].length);
		System.out.println("min = "+min+"\nmax = "+max+ "\nsomme = "+
		somme+"\nmoyenne = "+ moyenne);
		System.out.println("====================================");
		//Ex2 version2
		int minCol [] = new int [ m[0].length];
		int maxCol [] = new int [ m[0].length];

		for (int i=0; i<m[0].length; i++) {
			minCol[i]= m[0][i];
			maxCol[i]= m[0][i];
		}

		int sommeCol[] = new int [m[0].length];
		double moyenneCol[] = new double [m[0].length];
		for (int i=0; i<m.length; i++) {
			for (int j=0; j<m[i].length; j++) {
				minCol[j]=minCol[j]<m[i][j]?minCol[j]:m[i][j];
				maxCol[j]=maxCol[j]>m[i][j]?maxCol[j]:m[i][j];
				sommeCol[j]+=m[i][j];
			}
		}
		for (int i=0; i<moyenneCol.length; i++) {
			moyenneCol[i]=(double)sommeCol[i]/m.length;
			System.out.println("min colonne "+ i + " = "+minCol[i]+
					"\nmax colonne " + i + " = " + maxCol[i]+ 
					"\nsomme colonne "+ i + " = " + sommeCol[i]+
					"\nmoyenne colonne "+ i + " = "+ moyenneCol[i]);
		}
	}
}
