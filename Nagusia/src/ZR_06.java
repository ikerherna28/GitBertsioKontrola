
public class ZR_06 {

    public static void main(String[] args) {
        String esaldia = "Kaixo, Mundua!";
        String esaldiaBuelta = esaldiaBuelta(esaldia);
        System.out.println(esaldiaBuelta);
    }

    public static String esaldiaBuelta(String esaldia) {
        StringBuilder esaldiaBuelta = new StringBuilder(esaldia);
        return esaldiaBuelta.reverse().toString();
    }
}
