import java.util.ArrayList;

public class Glumci_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
		Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol. Private atributi su:
			da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova. 
			Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, 
			koliko godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." 
			ako su zenskog pola. Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
			napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet (preko getera i setera).
			*/
			 
		Glumci_Class glumac1 = new Glumci_Class();
		
		glumac1.ime = "Angelina";
		glumac1.prezime = "Jolie";
		glumac1.pol = "M";
		glumac1.rodjendan = 1972;
		glumac1.setstatus(false);
		glumac1.setprosecnaZarada(1934.55);
		glumac1.setbrojSnimljenih(50);
		glumac1.stampanje();
		
		ArrayList<String> Movies = new ArrayList<String>();
		Movies.add("Lord of the rings 1 (9.0)");
		Movies.add("Lord of the rings 2 (8.5)");
		Movies.add("Lord of the rings 3 (7.0)");
		Movies.add("Lord of the rings 4 (8.7)");
		Movies.add("Lord of the rings 5 (9.5)");
		
		Object alt = Movies.get(0);
		Movies.set(0, Movies.get(4));
		Movies.set(4, (String) alt);
		alt = Movies.get(1);
		Movies.set(1, Movies.get(4));
		Movies.set(4, (String) alt);
		alt = Movies.get(2);
		Movies.set(2, Movies.get(3));
		Movies.set(3, (String) alt);
		alt = Movies.get(3);
		Movies.set(3, Movies.get(4));
		Movies.set(4, (String) alt);
	
		
		
		
		
		
		
		
		for(int i = 0; i < Movies.size(); i++) {
			
			System.out.println(Movies.get(i));
			
		}
			
			
			
		
		
		
		
			 
	}

	}


