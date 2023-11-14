import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZR_08 {
	
    public static void main(String[] args) {
    	
        List<Integer> zerrenda1 = new ArrayList<>();
        zerrenda1.add(1);
        zerrenda1.add(3);
        zerrenda1.add(5);

        List<Integer> zerrenda2 = new ArrayList<>();
        zerrenda2.add(2);
        zerrenda2.add(4);
        zerrenda2.add(6);

        List<Integer> bildutakoZerrenda = new ArrayList<>(zerrenda1);
        bildutakoZerrenda.addAll(zerrenda2);

        Collections.sort(bildutakoZerrenda);

        System.out.println("Bildutako zerrendak: " + bildutakoZerrenda);
    }
}