import java.util.ArrayList;

public class ZerrendaElementuTxikienaEtaPosizioa {

	public static void main(String[] args) {
        ArrayList<Integer> zerrenda = new ArrayList<>();

        // Zerrenda betetzen, zenbakiak gehitu
        zerrenda.add(32);
        zerrenda.add(33);
        zerrenda.add(14);
        zerrenda.add(11);
        zerrenda.add(3);

        int txikiena = zerrenda.get(0); // Lehenengo elementua hasieratu
        int posizioa = 0;

        // Zerrenda bateko elementu txikiena eta bere posizioa kalkulatzen
        for (int i = 0; i < zerrenda.size(); i++) {
            if (zerrenda.get(i) < txikiena) {
                txikiena = zerrenda.get(i);
                posizioa = i+1; // +1 bestela posizioa kontatzeko momentuan 0tik hasten da
            }
        }

        // Emaitza inprimatu
        System.out.println("Elementu txikiena: " + txikiena);
        System.out.println("Posizioa: " + posizioa);
    }
}


