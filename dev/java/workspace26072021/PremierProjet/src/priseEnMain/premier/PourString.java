package priseEnMain.premier;

public class PourString {
	public static void main (String [] args) {
		
		
		System.out.println(isNotEmpty("a"));
		System.out.println(isNotEmpty(""));
		System.out.println(toUpperLowerCase("Bonjour"));

	String strChar = String.valueOf('a');
	String strBoolean = String.valueOf(true);
	String strLong = String.valueOf(1L);
	String strFloat = String.valueOf(1.1f);
	String strDouble = String.valueOf(1.1);
	System.out.println(strChar);
	System.out.println(strBoolean);
	System.out.println(strLong);
	System.out.println(strFloat);
	System.out.println(strDouble);
	}
	public static boolean isNotEmpty(String str) {
		return !str.isEmpty();
	}
	public static String toUpperLowerCase(String str){
		String strUp= str.toUpperCase();
		String strLo= str.toLowerCase();
		char[] ch = new char[str.length()];
		for (int i=0; i<str.length(); i++) {
			ch[i]=(i%2==0)?strUp.charAt(i):strLo.charAt(i);
		}
		return new String(ch);
	}
}
