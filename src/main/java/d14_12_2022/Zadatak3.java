package d14_12_2022;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//   Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
//   Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.
//   T1 i T2 su pozicije login forme. M je pozicija na koju je kliknuto
//        Primer izvrsenja 1:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 50
//        Unesite y za M: 50
//        Kliknuto je unutar forme


        System.out.print("Unesite x za T1: ");
        int xZaT1 = s.nextInt();
        System.out.print("Unesite y za T1: ");
        int yZaT1 = s.nextInt();
        System.out.print("Unesite x za T2: ");
        int xZaT2 = s.nextInt();
        System.out.print("Unesite y za T2: ");
        int yZaT2 = s.nextInt();
        System.out.print("Unesite x za M: ");
        int xZaM = s.nextInt();
        System.out.print("Unesite y za M: ");
        int yZaM = s.nextInt();

        if ((xZaT1 > xZaM && yZaT1 < yZaM) || (xZaT2 > xZaM && yZaT2 < yZaM)) {
            System.out.println("Kliknuto je unutar forme");

        } else {
            System.out.println("Nije kliknuto unutar forme");
        }





    }

}
