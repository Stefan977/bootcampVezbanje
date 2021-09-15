
public class Glumci_Class {

	public String ime;
	public String prezime;
	public int rodjendan;
	public String pol;
	private boolean status;
	private double prosecnaZarada;
	private int brojSnimljenih;
	public double ukupnaZarada;
	public Glumci_Class() {
		
		
		
	}
	
	
	
	public void setstatus(boolean status) {
		this.status = status;
		
		
	}
	
	public boolean getstatus() {
		
		return this.status;
		
	}

	public void setprosecnaZarada(double prosek) {
		this.prosecnaZarada = prosek;
		
	}
	
	public double getprosecnaZarada() {
		return this.prosecnaZarada;
		
		
	}
	
	public void setbrojSnimljenih(int broj) {
		
		this.brojSnimljenih = broj;
		
		
	}
	
	public int getbrojSnimljenih() {
		
		return this.brojSnimljenih;
		
		
		
		
	}
    public double ukupnaZarada() {
    	
    	double ukupnaZarada = this.prosecnaZarada * this.brojSnimljenih;
    	return ukupnaZarada;
    }
    
    public int sledeceGodine() {
    	
    	int sledeceGodine =  2022 - this.rodjendan;
    	return sledeceGodine;
    	
    }
    
  
    	
    	
    
	public void stampanje() {
		
		if(pol.equals("M")) {
			
			
		System.out.println("Name: Mr. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Born in: " + rodjendan + "\n" + "Gender: " + pol + "\n" + "Married: "
		+ status + "\n" + "Average salary: " + prosecnaZarada + "\n" + "Number of movies filmed: " + brojSnimljenih + "\n" + "Estimated worth: " 
		+ ukupnaZarada() + "\n" + "Age next year: " + sledeceGodine());
			
		}else {
			
		System.out.println("Name: Mrs. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Born in: " + rodjendan + "\n" + "Gender: " + pol + "\n" + "Married: "
	    + status + "\n" + "Average salary: " + prosecnaZarada + "\n" + "Number of movies filmed: " + brojSnimljenih + "\n" + "Estimated worth: " 
		+ ukupnaZarada() + "\n" + "Age next year: " + sledeceGodine());
			
			
		}
		
		
		
		
	}
	
	
	

}