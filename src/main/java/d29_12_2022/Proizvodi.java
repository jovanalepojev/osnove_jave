package d29_12_2022;

public class Proizvodi {

    private String nazivProizvoda;
    private double cena;
    private double tezina;

    public String getNazivProizvoda() {
        return this.nazivProizvoda;
    }

    public double getCena() {
        return cena;
    }

    public double getTezina() {
        return tezina;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public void stampaj(){
        System.out.println("{{" + nazivProizvoda + "}}"+ " , " +  "{{" + cena + "}}"+ " , " +  "{{" +
                tezina + "g" + "}}");
    }

    public void povecajCenu(double povecanje) {
        cena = cena + povecanje;
    }

    public double vratiCenuSaPoputom(double popust) {

        double cenaSaPopustom = cena - ( cena * (popust/100));
        return cenaSaPopustom;
    }

    public int racunajPostarinu() {

        int cenaPostarine = 0;

        if (tezina<=100) {
            return cenaPostarine = 200;
        } else if (tezina>=101 && tezina<=500) {
            return cenaPostarine= 400;
        } else if (tezina>500) {
            return cenaPostarine= 1000;
        }
        return 0;
    }
}
