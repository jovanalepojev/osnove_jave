package d26_12_2022;

public class Zadatak4 {

//    Napisati metodu koja stampa podatke o korisniku u formatu:
//    JMBG: [jmbg]
//    Ime: [ime]
//    Prezime: [prezime]
//    God. rodjenja: [god]
//    Aktivan: [true/false]
//    Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao
//    parametre metode.Metoda nista ne vraca


    public static void main(String[] args) {

        stampajPodatke("195823573", "Jovana", "Lepojev", 1996,false );


    }

    public static void stampajPodatke (String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan ) {
        System.out.println("JMBG: " + jmbg  );
        System.out.println("Ime: " + ime  );
        System.out.println("Prezime: " + prezime  );
        System.out.println("Godina rodjenja: " + godinaRodjenja + "." );

        if (aktivan==true){

            System.out.println("Aktivan: " + true);
        } else {
            System.out.println("Aktivan: " + false);
        }

    }
}
