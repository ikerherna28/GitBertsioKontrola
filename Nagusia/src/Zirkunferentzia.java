import java.util.Scanner;

public class Zirkunferentzia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Kaixo, sartu zirkunferentziaren erradioa:"); 
		int aldea1 = sc.nextInt(); 
		double emaitza = aldea1 * Math.PI;
		System.out.println("Azalera " + emaitza + " da."); 
	}

}


