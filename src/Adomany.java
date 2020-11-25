import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Adomany {
	private String alapitvanyNev;
	private List<String> alapitvanyLista;
	
	public String getAlapitvanyNev() {
		return alapitvanyNev;
	}
	
	public void alpitvanyKivalaszt() {
		System.out.println("Kiválasztottál egy alapítványt");
	}
	
	public void tamogatottOssezg() {
		System.out.println("Beállítottál egy öszeget");
	}
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("alpitvanyKivalaszt(), tamogatottOssezg()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "alpitvanyKivalaszt()": {
			
			alpitvanyKivalaszt();break;
		}
case "tamogatottOssezg()": {
			
	tamogatottOssezg();break;
		}


		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
	}
}
