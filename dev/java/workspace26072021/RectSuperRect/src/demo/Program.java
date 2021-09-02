package demo;

import java.util.List;

import entity.Exercice02;
import entity.Exercice3;

public class Program {
	
	public static Integer intToInteger(int i) {
		return i;
	}
	public static void main(String[] args) {
		
		System.out.println(intToInteger(5));
		
		Exercice02 ex2 = new Exercice02(); 
		List<Integer> list = ex2.tablToInteger(new int [] {2,4,5,1});
		System.out.println(list);
		
		Exercice3 ex3 = new Exercice3();
		ex3.addToList("Hello");
		ex3.addToList("world");
		ex3.addToList("world");
	}
	
}
