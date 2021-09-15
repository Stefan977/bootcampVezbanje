package Autobus;

public class Vozac extends Covek {

	private String zanimanje;

	public Vozac(String imeiPrezime, String zanimanje) {
		super(imeiPrezime);
		this.zanimanje = zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}
	public void stampanje() {
		
		System.out.println("Ime i Prezime vozaca: " + super.getImeiPrezime() + " Njegovo zanimanje: " + zanimanje);
		
		
	}
	public String toString() {
				
		return "Vozac: " + super.getImeiPrezime() + "\nZanimanje: " + zanimanje +"\n";
	
}
}