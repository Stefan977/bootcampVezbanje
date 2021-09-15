package Vezbe;

public class QualityOptimazerControl extends Control {

	private int brzina;

	public QualityOptimazerControl(int brzina) {
		super();
		this.brzina = brzina;
	}

	public int getBrzina() {
		return brzina;
	}

	public void setBrzina(int brzina) {
		this.brzina = brzina;
	}

	public void izvrsiAkciju(VideoPlayer vp) {
		
		double kvalitetVidea = brzina * 10.1;
		
		if (kvalitetVidea <= 144) {
		vp.setKvalitet(144);
	} else if (kvalitetVidea <= 240) {
		vp.setKvalitet(240);
	} else if (kvalitetVidea <= 480) {
		vp.setKvalitet(480);
	} else if (kvalitetVidea <= 720) {
		vp.setKvalitet(720);
	} else {
		vp.setKvalitet(1080);
	}
	
	}
   }
