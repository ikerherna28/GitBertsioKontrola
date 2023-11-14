import java.util.Scanner;

public class HandiagoaEdoTxikiagoa {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idatzi lehengo zenbakia: ");
        int zenbakia1 = scanner.nextInt();
        
        System.out.println("Idatzi bigarren zenbakia: ");
        int zenbakia2 = scanner.nextInt();

        boolean baiedoez = zenbakia1 > zenbakia2;

        System.out.println("Lehengo zenbakia, " + zenbakia1 + ", bigarren zenbakia baina handiagoa da: " + baiedoez);
        
        scanner.close();
	}

}
