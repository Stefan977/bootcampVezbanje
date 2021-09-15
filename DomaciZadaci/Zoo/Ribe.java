package Zoovrt;

public class Ribe extends Kicmenjaci {

	private String mesto;
	private int brPeraja;
	private String vrstaPeraja;
	
	public Ribe(String vrsta, String naziv, String hrana, String mesto, int brPeraja, String vrtaPeraja) {
		super(vrsta, naziv, hrana);
		this.mesto = mesto;
		this.brPeraja = brPeraja;
		this.vrstaPeraja = vrtaPeraja;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public int getBrPeraja() {
		return brPeraja;
	}
	public void setBrPeraja(int brPeraja) {
		this.brPeraja = brPeraja;
	}
	public String getVrtaPeraja() {
		return vrstaPeraja;
	}
	public void setVrtaPeraja(String vrtaPeraja) {
		this.vrstaPeraja = vrtaPeraja;
	}
	
	public void stampanje () {
		System.out.println("Ovo su " + super.getVrsta() + " nazivaju se " + 
	super.getNaziv() + " hrane se " + super.getHrana() + " obitavaju u " + mesto
	+ " imaju " + brPeraja + " peraja " + " peraja se nazivaju " + vrstaPeraja);
		
		
	}
	
}
