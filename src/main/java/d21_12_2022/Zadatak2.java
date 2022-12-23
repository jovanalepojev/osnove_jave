package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();

//        Napisati program koji ucitava N brojeva i smesta ih u niz. Zatim, iz niza, broji koliko je
//        parnih brojeva uneto. brojeve unosi korisnik.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.

        System.out.print("Unesite N brojeva: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);

            if (broj % 2 == 0) {
                suma = suma + 1;
            }

        }
        System.out.println("U nizu ima " + suma + " parna broja.");




    }
}
