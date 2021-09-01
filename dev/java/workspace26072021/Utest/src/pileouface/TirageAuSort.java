package pileouface;

public class TirageAuSort {
	
	private String valeur;

	public TirageAuSort() {
		lancePiece();
	}
	public String lancePiece() {
		if ((int) (Math.random()*2)==0)
				this.valeur="pile";
		else
			this.valeur="face";
		return valeur;
	}
	public String getValeur() {
		return valeur;
	}
}
