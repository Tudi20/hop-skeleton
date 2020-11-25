import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Fiokvaltas {
	private List<String> fiokok;
	
	public void kilepesFomenube() {
		Fomenu.choice();
	}
	
	public void fiokKivalaszt() {
		System.out.println("fiókot váltottál");
		Fomenu.choice();
	}
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("kilepesFomenube(), fiokKivalaszt()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "kilepesFomenube()": {
			
			kilepesFomenube();break;
		}
case "fiokKivalaszt()": {
			
	fiokKivalaszt();break;
		}


		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
	}
}
