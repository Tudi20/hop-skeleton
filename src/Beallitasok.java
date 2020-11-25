import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beallitasok {
	private int hangero;
	private boolean rezgomod;

	public void hangeroModosit() {
		System.out.println("Hangerõt módosítottál");
	}
	
	public void rezges() {
		System.out.println("rezgést módosítottál");
	}
	
	public void adomany() {
		
	}
	
	public void sugo() {
		System.out.println("elindítodtad a tutorialt");
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
