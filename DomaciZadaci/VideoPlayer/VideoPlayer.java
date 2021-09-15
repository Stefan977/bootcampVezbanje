package Vezbe;

public class VideoPlayer {

	private int duzinaVidea;
	private int trenutnoVreme;
	private int volume;
	private int kvalitet;
	public VideoPlayer(int duzinaVidea, int trenutnoVreme, int volume, int kvalitet) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVreme = trenutnoVreme;
		this.volume = volume;
		this.kvalitet = kvalitet;
	}
	public int getDuzinaVidea() {
		return duzinaVidea;
	}
	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	public int getTrenutnoVreme() {
		return trenutnoVreme;
	}
	public void setTrenutnoVreme(int trenutnoVreme) {
		this.trenutnoVreme = trenutnoVreme;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getKvalitet() {
		return kvalitet;
	}
	public void setKvalitet(int kvalitet) {
		this.kvalitet = kvalitet;
	}
	
	public void stampanje() {
		
		System.out.println("Duzina videa je " + duzinaVidea + ", trenutno vreme " + trenutnoVreme + " jacina zvuka " + volume + " kvalitet " + kvalitet);
		
		
		
	}
}
