package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Exercice4;

class Exercice4Test {

	@Test
	void testExistEnMot() {
		Exercice4 ex4= new Exercice4();
		assertTrue(ex4.ExistEnMot("Hello", 'o'));
		assertFalse(ex4.ExistEnMot("Hello", 'O'));
	}

}
