package demo;

import entity.Animal;

public class Zoo {
	protected Animal animal1;
	protected Animal animal2;
	protected Animal animal3;
	public Zoo(Animal animal1, Animal animal2, Animal animal3) {
		this.animal1 = animal1;
		this.animal2 = animal2;
		this.animal3 = animal3;
	}
	public Zoo() {

	}
	public void faireMangerTousLesAnimaux() {
		animal1.manger();
		animal2.manger();
		animal3.manger();
	}
	public void faireCrierTousLesAnimaux() {
		animal1.crier();
		animal2.crier();
		animal3.crier();
	}
	public void presenterAUnAnimal(Animal a) {
		animal1.presentation();
		animal2.presentation();
		animal3.presentation();
		a.presentation();
	}
	
}
