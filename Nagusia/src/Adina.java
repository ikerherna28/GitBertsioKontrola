import java.util.Scanner;

public class Adina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Apa, jarri zure izena:"); 
		String zureIzena = sc.next(); 
		System.out.println("Kaixo, " + zureIzena + ", zure adina idatzi:"); 
		int zureAdina = sc.nextInt(); 
		int emaitza = zureAdina + 5;
		System.out.println("Kaixo zure izena " + zureIzena + " da eta " + zureAdina + " urte dituzu. Zure adinari 5 gehitzen badiogu, emaitza " + emaitza + " da." ); 
	}

}
