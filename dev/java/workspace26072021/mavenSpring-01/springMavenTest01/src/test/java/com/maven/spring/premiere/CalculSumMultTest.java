package com.maven.spring.premiere;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculSumMultTest extends TestCase {
	private CalculSumMult calculSumMult;
	@Before
	protected void setUp() throws Exception {
		this.calculSumMult = new CalculSumMult();
	}
	@Test
	public void testSomme() {
		assertEquals(15, calculSumMult.somme(5,10));
	}
	@Test
	public void testMult() {
		assertEquals(50, calculSumMult.mult(5,10));
	}

}
