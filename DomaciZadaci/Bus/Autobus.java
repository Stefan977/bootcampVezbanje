package Autobus;

import java.util.ArrayList;

public class Autobus {

	private String naziv;
	private int cena;
	private Vozac voz;
	private ArrayList<Putnik> ListaPutnika;
	public Autobus(String naziv, int cena) {
		this.naziv = naziv;
		this.cena = cena;
		ListaPutnika = new ArrayList<Putnik>();
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
    public void dodatiPutnika(Putnik a) {

	this.ListaPutnika.add(a);

    }
    public void uklonitiPutnika(Putnik a) {

	this.ListaPutnika.remove(a);

    }
    public void uklonitiVozaca() {
    	this.voz = null;
    	
    }
    public void dodatiVozaca(Vozac a) {
    	if(this.voz==null) {
    		
    		this.voz = a;
    	}
    }
    public void naplateKarte() {
    	for(int i = 0; i < ListaPutnika.size(); i++) {
    		if(this.voz!=null) {
    			this.ListaPutnika.get(i).oduzimanje(this.cena);
    		}	
    	}
    }
	public String toString() {

		String vozacAutobusa;

		if (this.voz == null) {

			vozacAutobusa = "Autobus nema vozaca";

		} else {

			vozacAutobusa = "Autobus ima vozaca: " + this.voz.getImeiPrezime();

		}

		return "\nNaziv autobusa: " + naziv + " - Cena karte: " + cena + "din" + " - Putnici u autobusu: "

				+ ListaPutnika + "\n" + vozacAutobusa;
	}
	
}
