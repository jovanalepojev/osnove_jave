package d26_12_2022;

public class Zadatak3 {
//    Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se
//    formira kao na primeru. METODA NISTA NE STAMPA.
//    ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//    ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

    public static void main(String[] args) {

        String nova = novaVrednost("2","5");
        System.out.println(nova);

    }

    public static String novaVrednost (String a, String b) {

        String nova = a + b;

        return nova;
    }


}
