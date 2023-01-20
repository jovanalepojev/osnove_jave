package d19_1_2023;

public class StaklenaAmbalaza extends Ambalaza  {
     private int kaucija;
     private boolean daLiSePlacKaucija;
     private int osnovnaCena;


    public StaklenaAmbalaza(String barkod, String naziv, int netoTezina, int brutoTezina, int kaucija, boolean daLiSePlacKaucija, int osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.daLiSePlacKaucija = daLiSePlacKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtika() {
       if (daLiSePlacKaucija){
           return this.osnovnaCena * 1.2 + this.kaucija;
       }else {
           return this.osnovnaCena * 1.2;
       }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod + ", " + "Naziv: " + this.naziv +
                ", " + "Neto tezina: " + this.netoTezina + ", " + "Bruto tezina: " +
                this.brutoTezina + ", " + "Da li se placa kaucija: " + this.daLiSePlacKaucija + ", " +
                "Kaucija za flasu: " + this.kaucija + ", " + "Osnovna cena: " + this.osnovnaCena + ", " +
                "Cena artikla: " + this.cenaArtika());


    }
}
