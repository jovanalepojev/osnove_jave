package d20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//    Napisati program koji proverava uparenost zagrada.
//    Korisnik unosi matematicku formulu sve dok ne unese znak =. Korisnik unosi svaki karakter jednacine
//    posebno i na kraju programa se ispisuje da li su sve zagrade uparene.
//    Formula koja se koristi u primeru je: (2 * ( 1 + 3))=


        String unos = "";
        int counter1 = 0;
        int counter2 = 0;


        while (!unos.contains("=")) {

            System.out.print("Unos: ");
            unos = s.next();

            if (unos.contains(")")) {
                counter1 = counter1 + 1;

            } else if (unos.contains("(")) {
                counter2 = counter2 + 1;
            }

        }

        if (counter1 == counter2) {

            System.out.println("Zagrade su uparene");


        } else {
            System.out.println("Zagrade nisu uparene");
        }

    }

}


