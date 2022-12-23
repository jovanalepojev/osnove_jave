package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String>a = new ArrayList<String>();

        System.out.print("Unesite N: ");
        int n = s.nextInt();


        for (int i = 0; i<n; i++) {
            System.out.print("Unesite string: ");
             String unos = s.next();
             a.add(unos);
        }
        System.out.println("Komentar: Stanje niza a u memoriji je:");
        for (int i = a.size()-1; i>=0; i--) {
            System.out.println(a.get(i));
        }




    }
}
