package d20_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na ekranu ispisuje arapsku
//        vrednost sve dok korisnik ne unese KRAJ..

        String rimski = "";

        while (!rimski.contains("KRAJ")) {

            System.out.print("Unesite rimski broj: ");
            rimski = s.next();


            if (rimski.contains("I")) {
                System.out.println("Arapski: 1");
            }
            if (rimski.contains("V")) {
                System.out.println("Arapski: 5");
            }
            if (rimski.contains("X")) {
                System.out.println("Arapski: 10");
            }
            if (rimski.contains("L")) {
                System.out.println("Arapski: 50");
            }
            if (rimski.contains("C")) {
                System.out.println("Arapski: 100");
            }
            if (rimski.contains("D")) {
                System.out.println("Arapski: 500");
            }
            if (rimski.contains("M")) {
                System.out.println("Arapski: 100");
            }


        }
                System.out.println("Kraj programa.");




    }
}
