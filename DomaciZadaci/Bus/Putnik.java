package Autobus;

public class Putnik extends Covek {

	
	private int kinta = 1000;

	public Putnik(String imeiPrezime, int kinta) {
		super(imeiPrezime);
		this.kinta = kinta;
	}

	public int getKinta() {
		return kinta;
	}

	public void setKinta(int kinta) {
		this.kinta = kinta;
	}
	
	public int dodavanje(int dod) {
		return kinta = this.kinta + dod;
		
	}
	public int oduzimanje(int dod) {
		return kinta = this.kinta - dod;
   }
public String toString() {
		
		return "Putnik: " + super.getImeiPrezime() + ", ima sumu od: " + kinta + "din.";
	
	
	
	
		
	}
}
