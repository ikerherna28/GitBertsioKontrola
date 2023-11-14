import java.util.ArrayList;

public class ZR_05 {

    public static void main(String[] args) {
        ArrayList<Integer> zerrenda = new ArrayList<Integer>();
        zerrenda.add(1);
        zerrenda.add(2);
        zerrenda.add(3);
        zerrenda.add(1);
        zerrenda.add(5);
        zerrenda.add(7);
        zerrenda.add(8);

        int kopurua = monotoniaGorakorra(zerrenda);

        System.out.println("Monotonia gorakorra kopurua: " + kopurua);
    }

    public static int monotoniaGorakorra(ArrayList<Integer> zerrenda) {
        int kopurua = 0;
        int sekuentziaKopurua = 1;

        for (int i = 1; i < zerrenda.size(); i++) {
            if (zerrenda.get(i) > zerrenda.get(i - 1)) {
                sekuentziaKopurua++;
            } else {
                sekuentziaKopurua = 1;
            }

            if (sekuentziaKopurua > kopurua) {
                kopurua = sekuentziaKopurua;
            }
        }

        return kopurua;
    }
}
