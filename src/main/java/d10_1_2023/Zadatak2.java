package d10_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Proizvod p1=new Proizvod("The Witcher", 870);
        Kartica ck1 = new Kartica(6,8958968);
        Kupac k1 = new Kupac("Petar Petrovic");

        k1.setKartica(ck1);
        p1.setKupac(k1);

        p1.print();
        k1.print();

    }
}
