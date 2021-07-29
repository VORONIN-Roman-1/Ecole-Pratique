package exo;

public class StringConc {
	 public static void main (String[] args) {
		 
		 //EX3
		 String [] premiere= new String [] 
				 {"Bonjour ", "comm", "ça va les ", "j’aime ", "progr", "du c"};
		 String [] deuxieme= new String [] 
				 {"tout le monde ", "ent", "gens ", "beaucoup ", "ammer ", "ode "};
		 String [] conc= new String [premiere.length];
		 for(int i=0; i<premiere.length; i++) {
			 conc [i]=premiere[i]+ deuxieme[i];
		 }
		 for(String s:conc) System.out.print(s);
		 System.out.println();
		 /// EX4
		 int[] m=new int[] {5,2,11, -3};
		 for (int i=0; i<m.length; i++) {
			 if (i==m.length-1) m[i]=0;
			 else m[i]= m[i+1];
		 }
		 for(int i: m) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 
		 ////EX5
		 int [] x= {2,4,8,11,4};
		 int [] y = {1,5,3};
		 int [] mult = new int [x.length*y.length];
		 for (int i=0; i<y.length; i++)
			 for (int j=0; j<x.length; j++) {
				 mult[i*(x.length)+j]= y[i]*x[j];
			 }
		 for (int i:mult) System.out.print(i+" ");
		 System.out.println();
		 
		 
		 //EX6
		 char[] ch = {'r','e','s','s','a','s','s','e','r'};
		  boolean isPalindrome = true;
		 for(int i=0; i<(ch.length+1)/2; i++) {
			 if (ch[i]!=ch[ch.length-1-i]) isPalindrome= false;
		 }
		 String pali = isPalindrome?"Palindrome":"N'est pas palindrome";
		 System.out.println(pali);
	 }
	
	 
}
