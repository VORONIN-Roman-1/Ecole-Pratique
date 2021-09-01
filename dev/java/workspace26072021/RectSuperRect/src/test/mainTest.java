package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import demo.Program;

class mainTest {
	
	@Test
	void testIntToInteger() {
		assertEquals(6, Program.intToInteger(6));
	}

}
