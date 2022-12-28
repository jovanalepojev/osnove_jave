package d27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:
//        atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        atribut za izabranu temperaturu
//        atribut za mod (hladi/greje) - string
//        metodu za stampu (proizvoljno)
//        metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//        Metoda kao parametar prima temperaturu koja je napolju.

        SmartAirConditioning airConditioning1 = new SmartAirConditioning();

        airConditioning1.marka = "Gree";
        airConditioning1.temperatura = 26;
        airConditioning1.mod = "Greje";

        System.out.println("~ Proizvod 1 ~ ");

        airConditioning1.stampa();

        boolean x = airConditioning1.vracaTemperaturu(15);
        System.out.println("Temperatura napolju je veca: " + x);


        SmartAirConditioning airConditioning2 = new SmartAirConditioning();

        airConditioning2.marka = "Samsung";
        airConditioning2.temperatura = 12;
        airConditioning2.mod = "Hladi";

        System.out.println("~ Proizvod 2 ~ ");

        airConditioning2.stampa();

        boolean y = airConditioning2.vracaTemperaturu(36);
        System.out.println("Temperatura napolju je veca: " + y);

    }
}
