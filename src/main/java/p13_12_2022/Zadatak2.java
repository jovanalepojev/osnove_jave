package p13_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//         [NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//          [BOJA], [VELICINA]
//
//        Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//
//                Primer izvrsenja:
//        Sifra x932k20
//        Nike Patike - $90 - Popust 13.5%
//                Crna, 46.5

        String sifraProizvoda = "x92k50";
        String imeProizvoda = "Dell Laptop";
        double cena = 950;
        double popust = 17.6;
        String boja = "Crna";
        String velicina = "17";

        System.out.println("Sifra" + " " + sifraProizvoda);
        System.out.print(imeProizvoda + "-");
        System.out.print("$" + cena + " " + "-" + " ");
        System.out.println("Popust" + popust + "%");
        System.out.print(boja + ",");
        System.out.println(" " + velicina);


    }
}
