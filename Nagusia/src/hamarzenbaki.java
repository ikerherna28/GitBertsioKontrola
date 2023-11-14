import java.util.Random;

public class hamarzenbaki {

	public static void main(String[] args) {
		Random rand = new Random();

		System.out.println("10 zenbaki aleatorioak:");

			for (int i = 0; i < 10; i++) {
				int zenbakia = rand.nextInt(100); // Zenbaki aleatorioa 0 eta 99 tartean
	            System.out.println(zenbakia);
	        }
	    }
}
