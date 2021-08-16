package exo;

public class MinMax {
	public static void main(String[] args) {
		int m[]= new int [] {23, -4, 2, 0, -15};
		int min= m[0];
		int max= m[0];
		int somme=0;
		double moyenne=0.0;
		for (int i=0; i<m.length; i++) {
			min=min<m[i]?min:m[i];
			max=max>m[i]?max:m[i];
			somme+=m[i];
		}
		int i=30;
		// TODO change exo.moyenne
		moyenne=(double)somme/m.length;
		// FIXME corriger
		System.out.println("min = "+min+"\nmax = "+max+ "\nsomme = "+
		somme+"\nmoyenne = "+ moyenne);
		
	}
}
