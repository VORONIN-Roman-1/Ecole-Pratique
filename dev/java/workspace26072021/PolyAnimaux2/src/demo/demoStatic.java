package demo;

import entity.Animal;

public class demoStatic {
	public static void main(String[] args) {
		
		System.out.println(Animal.count);
		Animal koala= new Animal();
		Animal dodo = new Animal();
		System.out.println(koala.count);
	}
}
