import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UjJatek {
	private static String szobanev;
	
	public static void szobaLetrehozas() {
		
		SzobaLetrehozas t=new SzobaLetrehozas();
		t.choice();
	}
	
	public static void jatekKereses() {
		JatekKereses t=new JatekKereses();
		t.choice();
	}
	
	public static void vasarlas() {
		Vasarlas t=new Vasarlas();
		t.choice();
	}
	
	public static String getSzobanev() {
		return szobanev;
	}
	
	
	
	
	
	public void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("szobaLetrehozas(), jatekKereses(), vasarlas()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "szobaLetrehozas()": {
			
			szobaLetrehozas();break;
		}
case "jatekKereses()": {
			
	jatekKereses();break;
		}
case "vasarlas()": {
	
	vasarlas();break;
}

		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
		
	}
	}


