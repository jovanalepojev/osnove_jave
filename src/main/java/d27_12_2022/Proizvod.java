package d27_12_2022;

public class Proizvod {


    public String naziv;
    public double cena;
    public double tezina;


    public void stampaj() {
        System.out.println("{{" + this.naziv + "}}" + ", " + "{{" + this.cena + "}}" +
                ", " + "{{" + this.tezina + "}}");
    }

    public double vracaSracunatuVrednost(String jedinica) {
        double kg = 1000;
         double t = 100000;

         if (jedinica.contains("kg")) {
             return this.tezina / kg;
         } else if (jedinica.contains("t")) {
             return this.tezina / t;
         } else {
             return 0;
         }


    }
}





