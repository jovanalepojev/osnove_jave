package projekat1;

import java.util.Scanner;

public class XOZadatak {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        XOTabla xoTabla = new XOTabla();
        System.out.print("Unesite igraca X: ");
        String igracX = s.next();
        xoTabla.setImeIgracaX(igracX);
        System.out.print("Unesite igraca O: ");
        String igracO = s.next();
        xoTabla.setImeIgracaO(igracO);

        xoTabla.pokreniIgru();

        while (!xoTabla.pobednikX() && !xoTabla.pobednikO() && !xoTabla.popunjenaTabela()) {

            xoTabla.stampaj();
            System.out.println("Na potezu je: " + xoTabla.getNaPotezu());
            System.out.print("Odigraj potez: ");
            int potez = s.nextInt();

            if (!xoTabla.poljePrazno(potez)) {
                System.out.println("Potez nije validan!");
            } else {
                xoTabla.odigrajPotez(s.nextInt());
                xoTabla.zameniIgraca();
            }
        }

        if (xoTabla.pobednikX()) {
            System.out.println("Cestitamo! Pobednik je igrac X");
            System.out.println("Bravo " + xoTabla.getImeIgracaX());
        } else if (xoTabla.pobednikO()) {
            System.out.println("Cestitamo! Pobednik je igrac O");
            System.out.println("Bravo " + xoTabla.getImeIgracaO());
        } else {
            System.out.println("Igra je neresena!");
        }


    }
}
