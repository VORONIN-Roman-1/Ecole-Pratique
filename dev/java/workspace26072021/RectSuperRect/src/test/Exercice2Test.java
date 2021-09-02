package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Exercice2;

class Exercice2Test {

	@Test
	void testTablToInteger() {
		Exercice2 ex2= new Exercice2();
		assertArrayEquals(new int[] {4,2,1}, ex2.tableDeck(new int[] {1,2,4}));
	}

}
