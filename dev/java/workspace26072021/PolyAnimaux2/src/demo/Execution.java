package demo;

import entity.Animal;
import entity.Chat;
import entity.Chien;
import entity.PoissonRouge;

public class Execution {

	public static void main(String[] args) {
		
		Chat loulou = new Chat();
		loulou.setNom("Loulou");
		loulou.setCouleurCollier("Rouge");
		
		//loulou.crier();
		
		PoissonRouge nemo = new PoissonRouge();
		nemo.setNom("nemo");
		nemo.setSurfaceBocal(100);
		
		Chien dog = new Chien();
		dog.setNom("Sharik");
		dog.setCouleurBalle("rouge");
		
		//dog.manger();
		
		Animal a1 = loulou;
		Animal a2 = nemo;
		Animal a3 = dog;
		 
		//a1.crier();
		///a2.crier();
		//a3.crier();
		Chat cat = new Chat();
		cat.setNom("Murka");
		cat.setCouleurCollier("Vert");
		
		 Zoo zoo = new Zoo(a1, a2, a3);
		 zoo.faireMangerTousLesAnimaux();
		 zoo.faireCrierTousLesAnimaux();
		 zoo.presenterAUnAnimal(cat);
		/*
		Animal[] tabAnimal = new Animal[2];
		tabAnimal[0] = loulou;
		tabAnimal[1] = nemo;
		
		for(Animal animal : tabAnimal) {
			//animal.presentation();
			//animal.manger("pain");
			animal.crier();
		}
		*/
		
		
	}
}
