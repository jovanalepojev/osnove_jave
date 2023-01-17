package d16_1_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Igrac1 i1= new Igrac1("Petar Petrovic", "203698548",1991,6,"Levi bek", true);
        Karton k1 = new Karton("zuti");
        Karton k2 = new Karton("zuti");
        Karton k3 = new Karton("zuti");
        Karton k4 = new Karton("crveni");
        Karton k5 = new Karton("crveni");
        Karton k6 = new Karton("crveni");
        Karton k7 = new Karton("crveni");

        i1.dodajKarton(k1);
        i1.dodajKarton(k2);
        i1.dodajKarton(k3);
        i1.dodajKarton(k4);
        i1.dodajKarton(k5);
        i1.dodajKarton(k6);
        i1.dodajKarton(k7);

        i1.brojCrvenih();
        i1.brojZutih();

        i1.stampaj();


    }
}
