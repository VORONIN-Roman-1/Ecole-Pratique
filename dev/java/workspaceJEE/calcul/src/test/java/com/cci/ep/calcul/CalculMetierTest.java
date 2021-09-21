package com.cci.ep.calcul;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {
	
	private CalculMetier calculeMetier;
	@Before
	protected void setUp() throws Exception {
		this.calculeMetier= new CalculMetier();
	}

	@Test
	public void testSomme() {
		assertEquals(15.0, calculeMetier.somme(5, 10));
	}
	@Test
	public void testProduit() {
		assertEquals(50.0, calculeMetier.produit(5, 10));
	}

}
