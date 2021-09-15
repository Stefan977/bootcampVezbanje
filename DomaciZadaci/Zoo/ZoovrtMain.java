package Zoovrt;



public class ZoovrtMain {

	public static void main(String[] args) {
		

       
		
		
		Ribe r1 = new Ribe("Slatka", "Som", "Kaktus", "Reka", 4, "Brzi");
		Ribe r2 = new Ribe("Slatka", "Oslic", "Kaktus", "Reka", 4, "Brzi");
		Sisari s1 = new Sisari("Kicmenjaci", "Slon", "Kikiriki", "Siva", "Biljojed", "Divlja");
		Sisari s2 = new Sisari("Kicmenjaci", "Tigar", "Slon", "Narandzasta", "Mesozder", "Divlja");
		r1.stampanje();
		s1.stampanje();
		s1.setbojaDlake("Roze");
		s1.stampanje();
		
	    Staniste st = new Staniste("Bikini Bottom");
	    st.setListaZivotinja(s2);
		st.stampaj();
		st.uklonitiZivotinju(s2);
		st.stampaj();
		
		
	
		
		

	}

}
