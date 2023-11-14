import java.util.Scanner;

	public class PositiboEdoNegativo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Idatzi zenbakia ");
	        double zenbakia = scanner.nextDouble();

	        
	        boolean PositiboaDa = (zenbakia > 0);

	        
	        System.out.println("Positiboa da: " + PositiboaDa);
	    }
}