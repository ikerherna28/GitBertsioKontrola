
public class ZR_02 {

    public static void main(String[] args) {
        String esaldiaHutsunekin = "Kaixo Nire Izena Iker Da Eta Nire Abizena Hernandez Da.";
        String emaitza = esaldiaHutsunekin.replaceAll(" ", ""); // Hutsuneak ezabatu

        System.out.println("Sarrera testua: " + esaldiaHutsunekin);
        System.out.println("Emaitza testua: " + emaitza);
    }
}
