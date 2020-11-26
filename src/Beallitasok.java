import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beallitasok {
	private final int hangero = 100;
	private boolean rezgomod;

	public void hangeroModosit() {
		System.out.println("Hanger�t m�dos�tott�l. Hanger�d: " + hangero);
	}
	
	public void rezges() {
		System.out.println("rezg�st m�dos�tott�l. Rezg�s:  " + rezgomod);
	}
	
	public void adomany() {
		Adomany t = new Adomany();
		t.choice();
	}
	
	public void sugo() {
		System.out.println("elind�todtad a tutorialt");
	}
	
	public void fiokvaltas() {
		Fiokvaltas t= new Fiokvaltas();
		t.choice();
	}
	
	public void beallitasokBezar() {
		
		Fomenu.choice();
	}
	
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("hangeroModosit(), rezges(), sugo(), fiokvaltas(), beallitasokBezar()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "hangeroModosit()": {
			
			hangeroModosit();break;
		}
case "rezges()": {
			
	rezges();break;
		}
case "sugo()": {
	
	sugo();break;
}
case "fiokvaltas()": {
	
	fiokvaltas();break;
}
case "beallitasokBezar()": {
	
	beallitasokBezar();break;
}

		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
	}
}
