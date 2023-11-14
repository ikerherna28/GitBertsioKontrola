import java.util.Scanner;

public class Laukizuzena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Kaixo, sartu laukizuzenaren alde bat:"); 
		int aldea1 = sc.nextInt(); 
		System.out.println("Sartu beste aldea:"); 
		int aldea2 = sc.nextInt(); 
		int emaitza = aldea1 * aldea2;
		System.out.println("Azalera " + emaitza + " da." ); 
	}

}

