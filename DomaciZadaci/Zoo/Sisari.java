package Zoovrt;

public class Sisari extends Kicmenjaci {

	private String bojaDlake;
	private String ishrana;
	private String podela;
	
	public Sisari(String vrsta, String naziv, String hrana, String bojaDlake, String ishrana, String podela) {
		super(vrsta, naziv, hrana);
		this.bojaDlake = bojaDlake;
		this.ishrana = ishrana;
		this.podela = podela;
	}
	public String getBojaDlake() {
		return bojaDlake;
	}
	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}
	public String getIshrana() {
		return ishrana;
	}
	public void setIshrana(String ishrana) {
		this.ishrana = ishrana;
	}
	public String getPodela() {
		return podela;
	}
	public void setPodela(String podela) {
	this.podela = podela;
	}
	public void setbojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
		
	

    }
	public void stampanje() {
		
		System.out.println("Ovo su " + super.getVrsta() + " nazivaju se " + super.getNaziv() 
				+ " hrane se " + super.getHrana() + " " + bojaDlake + " im je boja dlake " + " oni su "
				+ ishrana + " to su " + podela);
	}
	
	
}
