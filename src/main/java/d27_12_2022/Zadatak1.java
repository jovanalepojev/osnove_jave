package d27_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo
//        da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012


        Proizvod proizvod1 = new Proizvod();

        proizvod1.naziv= "Sat";
        proizvod1.cena = 15000.00;
        proizvod1.tezina = 1800;

        System.out.println("~ Proizvod 1 ~ ");

        proizvod1.stampaj();

        double x = proizvod1.vracaSracunatuVrednost("t");
        System.out.println("tona: " + x);

        double y = proizvod1.vracaSracunatuVrednost("kg");
        System.out.println("kilogram: " + y);


        Proizvod proizvod2 = new Proizvod();

        proizvod2.naziv= "Daljinski upravljac";
        proizvod2.cena = 800.00;
        proizvod2.tezina = 2300;


        System.out.println("~ Proizvod 2 ~ ");

        proizvod2.stampaj();

        double a = proizvod2.vracaSracunatuVrednost("t");
        System.out.println("tona: " + a);

        double b = proizvod2.vracaSracunatuVrednost("kg");
        System.out.println("kilogram: " + b);


        }


}
