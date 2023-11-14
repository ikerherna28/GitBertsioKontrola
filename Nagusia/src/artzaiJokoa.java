import java.util.Scanner;

public class artzaiJokoa {
	
    static Scanner scanner = new Scanner(System.in);
    static final char J1 = 'X';
    static final char J2 = 'O';
    static final char HUTSA = '-';
    static boolean txanda;
    static char taula[][];

    public static void main(String[] args) {
        txanda = true;
        taula = new char[3][3];
        hasieratuTaula();

        int errenkada, zutabea;
        boolean zuzen;

        while (!partidaBukatu()) {
            do {
                erakutsiTaula();
                zuzen = false;
                System.out.println("Jokalari " + (txanda ? "1 (X)" : "2 (O)") + ", sartu errenkada eta zutabea (adibidea: 1 2): ");
                errenkada = eskatuZenb("Errenkada: ");
                zutabea = eskatuZenb("Zutabea: ");
                if (egiaztatuPosizioa(errenkada, zutabea) && !okupatutaDago(errenkada, zutabea)) {
                    zuzen = true;
                } else {
                    System.out.println("Leku hori beteta dago edo datuak ez dira zuzenak.");
                }
            } while (!zuzen);

            txertatu(errenkada, zutabea);
            aldatuTxanda();
        }

        erakutsiTaula();
        txapeldunaErakutsi();
    }

    static void hasieratuTaula() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taula[i][j] = HUTSA;
            }
        }
    }

    static void erakutsiTaula() {
        System.out.println("Tres en Raya\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(taula[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void erakutsiTxanda() {
        System.out.println("Txanda: Jokalari " + (txanda ? "1 (X)" : "2 (O)"));
    }

    static void aldatuTxanda() {
        txanda = !txanda;
    }

    static int eskatuZenb(String mezua) {
        int zenbakia = 0;
        boolean zenbakiaSartuta = false;
        while (!zenbakiaSartuta) {
            try {
                System.out.print(mezua);
                zenbakia = Integer.parseInt(scanner.nextLine());
                zenbakiaSartuta = true;
            } catch (NumberFormatException e) {
                System.out.println("Sartu zenbaki bat.");
            }
        }
        return zenbakia;
    }

    static boolean egiaztatuPosizioa(int errenkada, int zutabea) {
        return errenkada >= 0 && errenkada < 3 && zutabea >= 0 && zutabea < 3;
    }

    static boolean okupatutaDago(int errenkada, int zutabea) {
        return taula[errenkada][zutabea] != HUTSA;
    }

    static boolean partidaBukatu() {
        return false;
    }

    static void txertatu(int errenkada, int zutabea) {
        taula[errenkada][zutabea] = txanda ? J1 : J2;
    }

    static void txapeldunaErakutsi() {
        System.out.println("Partida bukatuta, txapelduna: Jokalari " + (txanda ? "2 (O)" : "1 (X)"));
    }
}