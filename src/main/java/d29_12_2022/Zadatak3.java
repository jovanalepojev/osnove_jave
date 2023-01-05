package d29_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {
// Kreirati klasu SmartAirConditioning koja ima:
// atribut za marku klime (npr: Samsung, Galanz, Gree, …)
// atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
// atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
// atribut za izabranu temperaturu (minimum je 16, maksimum 35)
// atribut za mod (hladi/greje)
// metodu za stampu - stampa u formatu 
// marka - mod - termperatura
// metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
// 30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
// metodu koja racuna koliko klima novca potrosi za mesec dana
// Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
// Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
// Metoda vraca ukupnu cenu za taj mesec

// U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.
  
        
        SmartAirConditioning proizvod1 = new SmartAirConditioning();

        proizvod1.setMarka("Gree");
        proizvod1.setPotrosnjaGreje(3);
        proizvod1.setPotrosnjaHladi(5);
        proizvod1.setTemperatura(16);
        proizvod1.setMod("Hladi");

        proizvod1.stampaj();

        int racun = proizvod1.cena("Hladi");
        System.out.println("Mesecni racun je: " + racun);

        System.out.println(" ");

        SmartAirConditioning proizvod2 = new SmartAirConditioning();

        proizvod2.setMarka("Samsung");
        proizvod2.setPotrosnjaGreje(4);
        proizvod2.setPotrosnjaHladi(6);
        proizvod2.setTemperatura(28);
        proizvod2.setMod("Greje");

        proizvod2.stampaj();

        int racun2 = proizvod2.cena("Hladi");
        System.out.println("Mesecni racun je: " + racun2);

    }
}
