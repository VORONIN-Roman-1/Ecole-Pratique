package franck.exos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {	
    	boolean isBreak= false;
    	try ( Scanner scanner = new Scanner(System.in)){
    		while(isBreak) {
    			try //utilisation du try/catch pour esquiver l'erreur
                {
                    System.out.println("Enter your year of birth :");
                    int yearOfBirth = scanner.nextInt(); //au lieu de nextLine, nextInt qui va provoquer l'erreur si on saisit quelque chose qui correspond pas
                    System.out.println("You age is : " + (2021 - yearOfBirth));
                    scanner.nextLine(); //handle next line character being pressing the enter key button
                    isBreak=true;
                }
                catch (Exception e)
                {
                    System.out.println("Invalid answer");
                    scanner.nextLine();
                }
    		}
    		 System.out.println("Enter your name : ");
    	        String name = scanner.nextLine();
    	        System.out.println("Your name is " + name);
    	}

    }
}
