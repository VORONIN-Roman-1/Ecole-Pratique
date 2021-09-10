package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import entity.Ex6;

class Ex6Test {

	@Test
	void testCountDouble() {
		Ex6 ex6 = new Ex6();
		assertEquals(0, ex6.CountDouble(Arrays.asList(2, 5, 6)));
		assertEquals(1, ex6.CountDouble(Arrays.asList(2, 6, 6)));
		assertEquals(2, ex6.CountDouble(Arrays.asList(2, 6, 6, 6)));
		assertEquals(2, ex6.CountDouble(Arrays.asList(2, 6, 6, 2)));
	}

}
