import java.util.Scanner;

public class Nagusia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Eskanerra martxan jartzeko
		System.out.println("Kaixo jarri zure izena:"); // Zure izena galdetzeko (inprimitzeko)
		String zureIzena = sc.next(); // Erantzuna irakurtzen du zureIzena bezala
		System.out.println("Zure izena " + zureIzena + " da, zure laguren izena idatzi:"); // Zure izena zein den esaten du (imprimituta)
		String lagunarenIzena = sc.next(); // Zure lagunaren izena irakurten du
		System.out.println("Kaixo " + zureIzena + " eta " + lagunarenIzena); // Zure izena eta zure lagunarena esaten du (imprimituta)
	}

}
