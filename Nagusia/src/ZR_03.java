
public class ZR_03 {

    public static void main(String[] args) {
        String sarrera = "Kaixo, programa hau TA TA TA irakurri behar ditu eta zenbat TA kopuru dauden esa.";
        int TAkopurua = kalkulatuTAKopurua(sarrera);

        System.out.println("Testua: " + sarrera);
        System.out.println("TA kopurua: " + TAkopurua);
    }

    public static int kalkulatuTAKopurua(String sarrera) {
        int kopurua = 0;
        for (int i = 0; i < sarrera.length() - 1; i++) {
            if (sarrera.charAt(i) == 'T' && sarrera.charAt(i + 1) == 'A') {
                kopurua++;
            }
        }
        return kopurua;
    }
}
