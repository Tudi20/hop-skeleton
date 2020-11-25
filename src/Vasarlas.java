import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vasarlas {
	private int jogosultsagSzint;
	
	public void fizetes() {
		System.out.println("Fizetéshez továbléptél");
	}
	
	public int getJogosultsagSzint( ) {
		return jogosultsagSzint;
	}
	
	public void jogusultsagModositas() {
		System.out.println("Jogusultságot módosítottál");
	}
	
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("fizetes(), jogusultsagModositas()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "fizetes()": {
			
			fizetes();break;
		}
case "jogusultsagModositas()": {
			
	jogusultsagModositas();break;
		}


		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
		
	}

}
