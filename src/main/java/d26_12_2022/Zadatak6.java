package d26_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    //    Napisati funkciju koja vrsi konverziju eura u dinare, rublje ili dolare prema dole navedenoj konverziji.
//    Metoda od parametara prima vrednost u eurima kao i valutu u kojoj je
//    potrebno izvrsiti konverziju (RSD/USD/RUB) a vraca konvertovanu vrednost.
//    U glavnom programu pozvati funkciju za neki od primera.
//    Primer poziva funkcija:
//    Ako se za vrednost u eurima unese 3 i valuta RSD vraca vrednost 351.6339
//    Ako se za vrednost u eurima unese 4.5 i valuta USD vraca vrednost 5.31945
//    Primer izvrsenja main programa:
//    Unesite vrednost u eurima: 3
//    Unesite valutu za konverziju: RSD
//      3 EUR je 351.6339 RSD
//    Konverzija eura u druge valute:
//              1 EUR = 117.5 RSD
//              1 EUR = 1.1 USD
//              1 EUR = 62.98 RUB
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost u eurima: ");
        int n = s.nextInt();

        System.out.print("Upisite valutu za konverziju: ");
        String v = s.next();
        System.out.println();

        double konvertuj = konvertuj(v, n);
        System.out.println(konvertuj);
    }
    public static double konvertuj(String valuta, int n) {


            if (valuta.equals("EUR")) {
                return n;
            } else if (valuta.equals("RSD")) {
                return 117.5 * n;
            } else if (valuta.equals("USD")) {
                return 1.1 * n;
            } else if (valuta.equals("RUB")) {
                return 62.98 * n;
            } else {
                return 0;
            }
    }

}



