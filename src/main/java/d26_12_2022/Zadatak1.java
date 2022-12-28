package d26_12_2022;

public class Zadatak1 {
//    Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati
//    izvrsenje metode za razlicite vrednosti.

    public static void main(String[] args) {

        int x = stampajVrednostZa10(9);
        System.out.println(x);

    }

    public static int stampajVrednostZa10 (int n){
        n=n+10;

        return n;

    }
}
