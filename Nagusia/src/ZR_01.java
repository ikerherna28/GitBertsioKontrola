
public class ZR_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double[] zenbakiZerrenda = {1, 2, 3, 4, 5}; // Zerranda

        double totala = 0.0;

        for (double zenbakia : zenbakiZerrenda) {
            totala += zenbakia;
        }

        double batezBestekoa = totala / zenbakiZerrenda.length;

        System.out.println("Zerrendako zenbaki guztien batez bestekoa: " + batezBestekoa);
    }
}
