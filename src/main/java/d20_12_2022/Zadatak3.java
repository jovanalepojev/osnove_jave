package d20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji od korisnika ucitava
//        brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.

        int counter1 = 0;
        int counter2 = 0;

        while (counter1 != 3 && counter2 != 2) {

            System.out.print("Unesite broj: ");
            int broj = s.nextInt();

            if (broj == 1) {
                counter1++;

            } else if (broj == 2) {
                counter2++;
            }

        }
        if (counter2 == 2) {
            System.out.println("Kraj uneto dve dvojke");

        }
        if (counter1 == 3){

            System.out.println("Kraj jer je uneto tri jedinice");
        }

    }
    }
