package Zoovrt;



import java.util.ArrayList;



public class Staniste {

	   private String nazivStanista;

		private ArrayList<Zivotinje> listaZivotinja = new ArrayList<>();

		public Staniste(String nazivStanista) {

			this.nazivStanista = nazivStanista;

		}

		public void setListaZivotinja(Zivotinje zivotinja) {
			listaZivotinja.add(zivotinja);
		}

		public ArrayList<Zivotinje> getListaZivotinja() {
			return listaZivotinja;
		}
		public void uklonitiZivotinju(Zivotinje a) {
			this.listaZivotinja.remove(a);
			
		}

		public String getNazivStanista() {
			return this.nazivStanista;
		}

		public void stampaj() {
			System.out.println("Naziv stanista: " + nazivStanista + "\nLista zivotinja iz ovog stanista:");
			 for (int i = 0; i < listaZivotinja.size(); i++) {
			      System.out.println(listaZivotinja.get(i).getNaziv());
			    }

		}
	}







