package test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

import pileouface.TirageAuSort;

class TirageAuSortTest2 {

	@Test
	void testTirageAuSort() {
		TirageAuSort tirageAuSort = new TirageAuSort();
		assertNotNull(tirageAuSort);
	}

	@Test
	void testLancePiece() {
		TirageAuSort tirageAuSort = new TirageAuSort();
		String resultat = tirageAuSort.lancePiece();
		assertTrue(resultat.equals("pile")|| resultat.equals("face"));
	}

	@Test
	void testGetValeur() {
		TirageAuSort tirageAuSort = new TirageAuSort();
		
		String resultat = tirageAuSort.getValeur();
		
		assertTrue(resultat.equals("pile")|| resultat.equals("face"));
	}

}
