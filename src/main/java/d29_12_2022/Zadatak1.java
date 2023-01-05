package d29_12_2022;

import java.util.Scanner;

public class Zadatak1 {
//
//    Napisati klasu Proizvod koja ima atribute
//    naziv proizvoda (String)
//    cenu proizvoda (double)
//    težinu proizvoda u gramima. (double)
//    i metode:
//    stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//    povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//            vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//    racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//    za tezinu do 100g, postarina iznosi 200din
//    za tezinu od 101g do 500g, postarina iznosi 400din
//    za tezinu preko 500g, postarina iznosi 1000din
//
//    U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Proizvodi proizvod1 = new Proizvodi();

        proizvod1.setNazivProizvoda("Svinjski but bez kosti");
        proizvod1.setCena(950);
        proizvod1.setTezina(850);

        proizvod1.stampaj();

        proizvod1.povecajCenu(368);
        double cena = proizvod1.getCena();

      double cenaSaPopustom =  proizvod1.vratiCenuSaPoputom(15);
        System.out.println(cenaSaPopustom);

        double postarina = proizvod1.racunajPostarinu();
        System.out.println(postarina);

        Proizvodi proizvod2 = new Proizvodi();

        proizvod2.setNazivProizvoda("Jacobs kafa");
        proizvod2.setCena(290);
        proizvod2.setTezina(200);

        proizvod2.stampaj();

        proizvod2.povecajCenu(130);
        double povecanje = proizvod2.getCena();

        double cenaSaPopustm = proizvod2.vratiCenuSaPoputom(38);
        System.out.println(cenaSaPopustm);

        double postarina2 = proizvod2.racunajPostarinu();
        System.out.println(postarina2);





    }
}
