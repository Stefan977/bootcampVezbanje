package Vezbe;

public class AudioControl extends Control {

	
	private boolean volume;

	public AudioControl(boolean volume) {
		super();
		this.volume = volume;
	}

	public boolean isVolume() {
		return volume;
	}

	public void setVolume(boolean volume) {
		this.volume = volume;
	}

	
	public void izvrsiAkciju(VideoPlayer vp) {
		
		if(volume) {
			
			if(vp.getVolume() < 100) {
				vp.setVolume(vp.getVolume() + 1);
				
				
			}
			else {
				vp.setVolume(100);
				
			}
		}
		else {
			
			if(vp.getVolume() > 0) {
				vp.setVolume(vp.getVolume() - 1);
				
			}
			else {
				vp.setVolume(0);
			}
		}
	}
	
	
}
