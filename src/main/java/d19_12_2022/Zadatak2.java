package d19_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji ucitava N brojeva od korisnika
//        i sabira samo trocifrene brojeve.
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 32
//        Unesite broj: 121
//        Unesite broj: 1333
//        Unesite broj: 144
//        Suma je: 265

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            if (broj>99 && broj<1000) {
             suma = suma + broj;
            }
        }
        System.out.print("Suma je: " + suma);








    }
}
