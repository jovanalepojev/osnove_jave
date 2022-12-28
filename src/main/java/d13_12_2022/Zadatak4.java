package d_13_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji racuna i ispisuje povrsinu i obim trougla. KOREN BROJA 3 neka bude konstanta 1.73. Za stranicu trougla postavite proizvoljnu vrednost.
//              Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30

        double a = 6.5;
        double povrsinaTrougla = (a*a)*1.73/4;
        double obimTrougla = a*3;

        System.out.println("Povrsina je " + povrsinaTrougla);
        System.out.println("Obim je "  + obimTrougla);


    }

}
