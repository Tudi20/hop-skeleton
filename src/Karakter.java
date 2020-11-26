
public class Karakter {
	private int karakterAzonosito;
	private String race;
	//Nem lehet class a neve, mert az kulcsszó...
	private String osztaly; 
	private int maxEletero;
	private int sebzes;
	private int vedelem;
	private String specialNev;
	private int specialSebzes;
	private int skinTipus;
	
	public int getKarakterAzonosito() {
		return karakterAzonosito;
	}
	
	public String getRace() {
		return race;
	}
	
	// getClass az egy alap függvény Javában, nem kéne felülírni, lol
	public String getOsztaly() {
		return osztaly;
	}
	
	//Milyen eleterõt adjak vissza?
	public int getEletero() {
		return maxEletero;
	}
	
	public int getSebzes() {
		return sebzes;
	}
	
	public int getVedelem() {
		return vedelem;
	}
	
	public String getSpecialNev() {
		return specialNev;
	}
	
	public int getSpecialSebzes() {
		return specialSebzes;
	}
	
	public int getSkinTipus() {
		return skinTipus;
	}
}
