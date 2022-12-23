package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5DrugoResenje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

//        Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b
//        tako sto se prva 3 elementa niza a kopiraju u niz b,
//        a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)


        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            a.add(broj);
            b.add(broj);
        }

        for (int i = 3; i < b.size() ; i++) {
            b.set(i,1);
        }
        System.out.println("Niz a: ");
        for (int i=0; i<a.size();i++) {
            System.out.print(a.get(i) + ", ");
        }
        System.out.println(" ");
        System.out.println("Niz b: ");
        for (int i=0; i<b.size();i++) {
            System.out.print(b.get(i) + ", ");
        }
    }
}
