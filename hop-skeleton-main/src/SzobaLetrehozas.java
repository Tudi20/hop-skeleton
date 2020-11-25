import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class SzobaLetrehozas {
	private String jelszo;
	private int letszam;
	private List<Palya> palyaLista;
	private int palyaAzonosito;
	private int szobaAzonosito;
	
	public static void jatek() {
		System.out.println("Elindult a játékmenet");
	}
	
	public void palyaValasztas() {
		System.out.println("Kiválasztodtad a pályát");
	}
	
	public void jelszo() {
		System.out.println("beállítodtad a jelszót");
	}
	
	public void jatekosKezeles() {
		System.out.println("Elfogadtad vagy kiragtad a vátékost");
	}
	
	
	public void setLetszam(int letszam) {
		System.out.println("Beállítodtad a létszámot");
		this.letszam = letszam;
	}

	public int getLetszam( ) {
		return letszam;
	}
	
	public String getJelszo( ) {
		return jelszo;
	}
	
	public void szobaElhagyas() {
		UjJatek t=new UjJatek();
		t.choice();
	}
	
	public int getPalyaAzonosito( ) {
		return palyaAzonosito;
	}
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("jatek(), palyaValasztas(), jelszo(), jatekosKezeles(), setLetszam()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
switch (be) {
case "jatek()": {
			
	jatek();break;
		}
case "palyaValasztas()": {
			
	palyaValasztas();break;
		}
case "jelszo()": {
	
	jelszo();break;
}
case "jatekosKezeles()": {
	
	jatekosKezeles();break;
}
case "setLetszam()":{
	setLetszam(0);	break;
}
case "szobaElhagyas()":{
	szobaElhagyas();break;
}
		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
		
	}

}
