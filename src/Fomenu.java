import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fomenu {
	
	private static String aktualisFiok;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program elindult");
		betoltoKep();
		choice();
		
		
	}
	public static void choice() {
		InputStreamReader instream = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(instream);
        
        System.out.println("�rd be, az al�bbiak k�z�l, hogy melyik met�dust akarod lefuttatni! (Ez mindig �gy lesz)");
        System.out.println("ujJatek(), hoskozpont(), beallitasok(), kilepes(), bejelentkezes(), regisztracio(), fiokMentes()");
        
        String be="";
        try {
        be=input.readLine();
        }catch (IllegalArgumentException e) {
            System.out.println(e);
            
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (be) {
		case "ujJatek()": {
			
			ujJatek();
			break;
		}
case "hoskozpont()": {
			
	hoskozpont();break;
		}
case "beallitasok()": {
	
	beallitasok();break;
}
case "kilepes()": {
	
	kilepes();break;
}
case "bejelentkezes()": {
	
	bejelentkezes();break;
}
case "regisztracio()": {
	
	regisztracio();break;
}
case "fiokMentes()": {
	
	fiokMentes();break;
}
		default:
			throw new IllegalArgumentException("Unexpected value: " + be);
		}
	}
	
	
	private static void ujJatek() {
		UjJatek t=new UjJatek();
		t.choice();
	}
	
	private static void hoskozpont() {
		Hoskozpont t=new Hoskozpont();
		t.choice();
	}
	
	private static void beallitasok() {
		Beallitasok t = new Beallitasok();
		t.choice();
		
	}
	
	private static void kilepes() {
		System.exit(0);
	}
	
	private static void bejelentkezes() {
		System.out.println("Bejelentkezt�l");
	}
	
	private static void regisztracio() {
		System.out.println("regisztr�lt�l");
	}
	
	private static void betoltoKep() {
		System.out.println("T�lt�k�perny�...");
	}
	
	private static void fiokMentes() {
		System.out.println("Elmentedted a fi�kod");
	}
	
	public static String getAktualisFiok() {
		return aktualisFiok;
	}
	
	public static void setAktualisFiok(String _aktualisFiok) {
		aktualisFiok = _aktualisFiok;
	}

}
