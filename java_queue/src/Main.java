import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Random & Scanner & Variablen
        Random random = new Random();
        Scanner reader = new Scanner(System.in);

        List<String> namensliste = new ArrayList<>();
        namensliste.add("Simon");
        namensliste.add("Fritz");
        namensliste.add("Vogt");
        namensliste.add("Mathias");
        namensliste.add("Marionnaud");
        namensliste.add("Jonny boy");
        namensliste.add("Leonie");
        namensliste.add("Julia");


        int[] laenge = new int[3];

        // Warteschlange erstellen
        Kassa kass1 = new Kassa();
        Kassa kass2 = new Kassa();
        Kassa kass3 = new Kassa();

        List<Kassa> KassaListe = new ArrayList<>();

        KassaListe.add(kass1);
        KassaListe.add(kass2);
        KassaListe.add(kass3);

        List<Kunde> kundenliste = new LinkedList<>();


        // Kundenliste erstellen
        for (int l = 0; l < 3; l++){
            laenge[l] = random.nextInt(7);
            for (int i = 0; i <= laenge[l]; i++) {
                Kunde a = new Kunde(i, namensliste.get(random.nextInt(7)),
                        random.nextDouble(0.01, 300), false);

                KassaListe.get(l).addCustomer(a);
                kundenliste.add(a);
            }
        }

        // Test
        /*
        for (Kunde i : warteschlange){
            System.out.println(i);
        }
        */


        // Kasse
        for (int m = 0; m < 3; m++) {
            int durchgang = 0;

            while (KassaListe.get(m).sizeWarteschlange() != 0) {
                System.out.println("Übrige Kunden: " + KassaListe.get(m).sizeWarteschlange());
                System.out.println("Willst du bezahlen ?");
                System.out.printf("Preis: %.2f \n", KassaListe.get(m).getEinkaufspreis());
                boolean antwort = reader.nextBoolean();

                if (antwort) {
                    System.out.println("Danke für deinen Einkauf " + KassaListe.get(m).getName());
                    System.out.println();
                    KassaListe.get(m).removeCustomer();
                    kundenliste.get(durchgang).setBezahlt(true);
                    durchgang++;
                }

            }
        }
        System.out.println();
        System.out.println("Kasse ende");
        for (Kunde i : kundenliste){
            System.out.println(i);
        }


    }
}