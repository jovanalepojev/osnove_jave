package d26_12_2022;

public class Zadatak2 {

//    Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost. Metoda od parametara prima ime i prezime
//    (2 parametra) i vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.

    public static void main(String[] args) {
        String punoIme = stampajPunoIme("Jovana ", "Lepojev");
        System.out.println(punoIme);

    }

    public static String stampajPunoIme (String ime, String prezime) {

        String punoIme = ime + prezime;
        return punoIme;

    }
}
