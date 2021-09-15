package Vezbe;

import java.util.ArrayList;

public class VideoPlayer_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		VideoPlayer v1 = new VideoPlayer(145, 40, 97, 1080);
		v1.stampanje();

		System.out.println("--------Dodavanje trenutnog vremena videa----------");

		TimeControl t1 = new TimeControl(true);
		t1.izvrsiAkciju(v1);
		v1.stampanje();

		System.out.println("--------Pojacavnje zvuka ------------");

		AudioControl a1 = new AudioControl(true);
		a1.izvrsiAkciju(v1);
		v1.stampanje();

		System.out.println("--------Odredjivanje kvaliteta na osnovu brzine interneta----------");

		QualityOptimazerControl o1 = new QualityOptimazerControl(35);
		o1.izvrsiAkciju(v1);
		v1.stampanje();

		System.out.println("--------Lista akcija----------");

		ArrayList<Control> akcije = new ArrayList<Control>();
		akcije.add(t1);
		akcije.add(a1);
		akcije.add(o1);

		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(v1);

		}

		v1.stampanje();

	}

}
