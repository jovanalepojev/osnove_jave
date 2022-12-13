package p13_12_2022;

import java.sql.SQLOutput;

public class Zadatak6 {
    public static void main(String[] args) {

//        Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
//        Primer izvrsenja:
//        a: 5
//        Povrsina kvadrata je 25
//        r: 3
//        Povrsina kruga je 28.26


        int a = 10;
        int r = 5;
        double PI = 3.14;
        double povrsinjKvadrata = a*a;
        double povrsinakruga = (r*r)*PI;

        System.out.println("a=  " + a);
        System.out.println("r=  " + r);

        System.out.println("Povrsina kvadrata je  " + povrsinjKvadrata );
        System.out.println("Povrsina kruga je    " + povrsinakruga);




    }
}
