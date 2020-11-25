import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class JatekKereses {
	private List<SzobaLetrehozas> szobaLista;
	
	public void belepes( ) {
		System.out.println("Beléptél a szobába");
	}
	
	public void jelszoEllenorzes() {
		System.out.println("Ellenõrizted a jelszót");
	}
	
	public void szures() {
		System.out.println("Szobanévre kerestél");
	}
	
	public void kereses( ) {
		System.out.println("Frissíteted a szobák listáját");
	}
	
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("belepes(), jelszoEllenorzes(), szures(), kereses()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "belepes()": {
			
			belepes();break;
		}
case "jelszoEllenorzes()": {
			
	jelszoEllenorzes();break;
		}
case "szures()": {
	
	szures();break;
}
case "kereses()": {
	
	kereses();break;
}
		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
		
	}
}
