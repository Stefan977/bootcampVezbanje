package Vezbe;

public class TimeControl extends Control {

	
	 private boolean unapred;

	public TimeControl(boolean unapred) {
		super();
		this.unapred = unapred;
	}

	public boolean isUnapred() {
		return unapred;
	}

	public void setUnapred(boolean unapred) {
		this.unapred = unapred;
	}

	
	public void izvrsiAkciju(VideoPlayer vp) {
		
		if (unapred) {
			
			if(vp.getTrenutnoVreme() < vp.getDuzinaVidea() - 15) {
				vp.setDuzinaVidea(vp.getDuzinaVidea() + 15);
			} else {
				vp.setTrenutnoVreme(vp.getDuzinaVidea());
				
				
			}
			
			
		}
		else {
			
			if(vp.getTrenutnoVreme() > 15) {
				vp.setTrenutnoVreme(vp.getTrenutnoVreme() - 15);
		}
		
		else {
			vp.setTrenutnoVreme(0);
		
	}
		}
	}
}

		
		
	


