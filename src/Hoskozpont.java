import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Hoskozpont {
	private String hosNev;
	private int hosAzonosito;
	private int skinAzonosito;
	private List<Karakter> karakterLista;
	private List<Skinek> skinLista;
	
	public int getHosAzonosito() {
		return hosAzonosito;
	}
	
	public int getSkinAzonosito() {
		return skinAzonosito;
	}
	
	public static void karakterValasztas() {
		System.out.println("Kiválasztodtad a karaktered");
	}
	
	public static void vasarlas() {
		Vasarlas t= new Vasarlas();
		t.choice();
	}
	
	public String getHosnev() {
		return hosNev;
	}
	
	public static void skinModositas() {
		System.out.println("Megváltoztadtad a skined");
	}
	
	public static void hosnevModositas() {
		System.out.println("Megváltoztadtad a hõs nevét");
	}
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("karakterValasztas(), vasarlas(), skinModositas(), hosnevModositas()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "karakterValasztas()": {	
			karakterValasztas();break;
		}
		case "vasarlas()": {
	vasarlas();break;
		}
		case "skinModositas()": {
	skinModositas();break;
}
		case "hosnevModositas()": {
	hosnevModositas();break;
}
		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
	}
}
