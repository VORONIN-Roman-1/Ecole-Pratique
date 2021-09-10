package test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Field;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.Exercice3;

class Exercice3Test {

	private Exercice3 ex3 = new Exercice3();
	@Test
	void testExercice3() {
		assertNotNull(ex3);
	}

	@Test
	void testAddToList() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		assertArrayEquals(ex3.getList().toArray(), new String[] {});
		ex3.addToList("Hello");
		assertArrayEquals(ex3.getList().toArray(), new String[] { "Hello" });
		ex3.addToList("Hello");
		assertArrayEquals(ex3.getList().toArray(), new String[] { "Hello" });
		ex3.addToList("world");
		assertArrayEquals(ex3.getList().toArray(), new String[] { "Hello", "world" });
		ex3.addToList("world");
		assertArrayEquals(ex3.getList().toArray(), new String[] { "Hello", "world" });
	}

	@Test
	void testRemoveIntoList() {
		ex3.addToList("Hello");
		ex3.removeIntoList("Hello");
		assertArrayEquals(ex3.getList().toArray(), new String[] {});
		ex3.addToList("Hello");
		ex3.removeIntoList("world");
		assertArrayEquals(ex3.getList().toArray(), new String[] { "Hello" });
	}
	@Test
	void testGetList() {
		ex3.addToList("Hello");
		assertArrayEquals(ex3.getList().toArray(), new String[] { "Hello" });
	}
	
}
