
public class ZR_09 {

    public static void main(String[] args) {
        String testua = "kaiak"; // 

        if (palindromoaDa(testua)) {
            System.out.println(testua + " palindromoa da.");
        } else {
            System.out.println(testua + " ez da palindromoa.");
        }
    }

    public static boolean palindromoaDa(String testua) {
        // Kendu hutsuneak eta bihurri egin
        testua = testua.replaceAll("\\s+", "").toLowerCase();
        String biratua = new StringBuilder(testua).reverse().toString();

        return testua.equals(biratua);
    }
}
