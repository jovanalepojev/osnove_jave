package d14_12_2022;

import java.util.Scanner;
//        Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
//        b=1, vrednost promenljive a se uvecava za 10
//        b=2, vrednost promenljive a se smanjuje za 20
//        Na kraju zadatka odstampati novu vrednost promenljive a.
//        Primer izvrsenja:
//        Unesite a: 44
//        Unesite b: 2
//        Nova vrednost za a je 24

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj A: ");
        int a = s.nextInt();
        System.out.print("Unesite broj B: ");
        int b = s.nextInt();

          if (b == 1) {
              a = a + 10;
              System.out.println("Nova vrednost za A je: " + a);
          } else if (b == 2) {
            a = a - 20;
              System.out.println("Nova vrednost za A je: " + a);
          } else {
              System.out.println("Unesite za b 1 ili 2!");
          }








    }
}
