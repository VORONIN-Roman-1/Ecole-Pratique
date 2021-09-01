package test;

import pileouface.TirageAuSort;

public class TirageAuSortTest {
	public static void main(String[] args) {
		TirageAuSort t = new TirageAuSort();
		System.out.println("valeur initiale du terage: "+ t.getValeur());
		for(int i=0; i<10; i++) {
			String val= t.lancePiece();
			System.out.println("valuer "+ t.getValeur());
		}
	}
}
