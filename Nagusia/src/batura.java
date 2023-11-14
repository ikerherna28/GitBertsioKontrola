import java.util.Scanner;

public class batura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Idatzi zenbaki positibo bat: ");
        int zenbakia = scanner.nextInt();
        
        int gehiketa = 0;
        for (int i = 1; i <= zenbakia; i++) {
            gehiketa += i;
        }
        
        System.out.println( zenbakia + " zenbakiar iritsi arteko batura hau da: " + gehiketa );
        
        scanner.close();
    }
}