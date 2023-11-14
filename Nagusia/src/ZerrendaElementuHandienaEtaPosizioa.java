import java.util.ArrayList;

public class ZerrendaElementuHandienaEtaPosizioa {

	public static void main(String[] args) {
        ArrayList<Integer> zerrenda = new ArrayList<>();

        // Zerrenda betetzen, zenbakiak gehitu
        zerrenda.add(32);
        zerrenda.add(33);
        zerrenda.add(14);
        zerrenda.add(11);
        zerrenda.add(3);

        int handiena = zerrenda.get(0); // Lehenengo elementua hasieratu
        int posizioa = 0;

        // Zerrenda bateko elementu handiena eta bere posizioa kalkulatzen
        for (int i = 0; i < zerrenda.size(); i++) {
            if (zerrenda.get(i) > handiena) {
                handiena = zerrenda.get(i);
                posizioa = i+1; // +1 bestela posizioa kontatzeko momentuan 0tik hasten da
            }
        }

        // Emaitza inprimatu
        System.out.println("Elementu handiena: " + handiena);
        System.out.println("Posizioa: " + posizioa);
    }
}

