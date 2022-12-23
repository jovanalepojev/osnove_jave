package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer>brojevi = new ArrayList<Integer>();


//        Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni) i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//        Primer:
//        Unesite pozicjiu od 0 do 9: 3
//        Unesite novu vrednost: 11
//        Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.add(60);
        brojevi.add(70);
        brojevi.add(80);
        brojevi.add(90);
        brojevi.add(100);

        System.out.print("Unesite pozicjiu od 0 do 9: ");
        int k = s.nextInt();

        System.out.print("Unesite novu vrednost: ");
        int vrednost = s.nextInt();

        brojevi.get(k);
        brojevi.set(k, vrednost);

        System.out.println(brojevi.get(k));



    }
}
