package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import entity.Ex7;

class Ex7Test {

	@Test
	void testCountAnagrammes() {
		assertEquals(0, new Ex7().CountAnagrammes(Arrays.asList("Hello")));
		assertEquals(1, new Ex7().CountAnagrammes(Arrays.asList("Hello" , "hello")));
		assertEquals(1, new Ex7().CountAnagrammes(Arrays.asList("Hello" , "ehllo")));
		assertEquals(1, new Ex7().CountAnagrammes(Arrays.asList("Hello" , "ehllo")));
		assertEquals(2, new Ex7().CountAnagrammes(Arrays.asList("Hello" , "Hello" , "Hello")));
		assertEquals(3, new Ex7().CountAnagrammes(Arrays.asList("Hello" , "ehllo","Hello" , "ehllo")));
		assertEquals(4, new Ex7().CountAnagrammes(Arrays.asList("Hello" , "ehllo","Hello" , "ehllo","world", "rodlw")));
	}

}
