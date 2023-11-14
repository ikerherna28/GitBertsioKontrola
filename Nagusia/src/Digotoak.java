import java.util.Scanner;

public class Digotoak {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Zenbaki oso bat idatzi: ");
        long zenbakia = scanner.nextLong();

        // Zenbaki negatiboa positiboa bihuretzen du
        if (zenbakia < 0) {
            zenbakia = -zenbakia;
        }

        int digito = 1; // Gutxienez digito bat (kasu honetan 0)
        
        while (zenbakia >= 10) {
            zenbakia /= 10;
            digito++;
        }

        System.out.println("Idatzitako zenbakia " + digito + " digito ditu.");

        scanner.close();
    }
}
