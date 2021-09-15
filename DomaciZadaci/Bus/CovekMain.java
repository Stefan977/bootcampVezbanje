package Autobus;

public class CovekMain {

	public static void main(String[] args) {
		
		Vozac v1 = new Vozac("Pera Gaser", "Sofer");
		System.out.println(v1);
		Putnik p1 = new Putnik("Stefan Mali", 2000);
		Putnik p2 = new Putnik("Stefan Mali", 2000);
		Putnik p3 = new Putnik("Stefan Mali", 2000);
		System.out.println(p1);
		Autobus a1 = new Autobus("Lasta",500);
		System.out.println(a1);
		a1.dodatiPutnika(p1);
		a1.dodatiPutnika(p2);
		a1.dodatiPutnika(p3);
		a1.uklonitiPutnika(p1);
		a1.dodatiVozaca(v1);
		a1.naplateKarte();
		System.out.println(a1);

	}

}
