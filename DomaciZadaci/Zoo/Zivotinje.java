package Zoovrt;

public class Zivotinje {

	private String vrsta;
	private String naziv;
	private String hrana;
	public Zivotinje(String vrsta, String naziv, String hrana) {
		this.vrsta = vrsta;
		this.naziv = naziv;
		this.hrana = hrana;
		
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getHrana() {
		return hrana;
	}
	public void setHrana(String hrana) {
		this.hrana = hrana;
	}
	
	
}
