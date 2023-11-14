import java.util.Arrays;

public class ZenbakiaZerrendanDagoen {


	public static void main(String[] args) {
		int[] zerrenda = {12, 34, 56, 78, 92, 100, 59, 10, 3, 8, 33}; // Nahi ditudan zenbakiak idatzi ditzazket
		int bilatuZenbakia = 33; // Bilatu nahi dudan zenbakia hemen idatzi beharko dut

		// Zerrenda ordenatuta egon behar du binariozko bilaketarako
		Arrays.sort(zerrenda);

		// Zenbaki bat zerrendan dagoen edo ez aztertu (binariozko bilaketaren algoritmoa erabiliz)
		int emaitza = Arrays.binarySearch(zerrenda, bilatuZenbakia);

		if (emaitza >= 0) {
			System.out.println(bilatuZenbakia + " zenbakia, zerrendan dago.");
		} else {
			System.out.println(bilatuZenbakia + " zenbakia, ez dago zerrendan.");
	        }
	    }
}