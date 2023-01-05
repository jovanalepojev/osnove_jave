package d29_12_2022;

public class Zadatak3 {
    public static void main(String[] args) {

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
