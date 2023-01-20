package d19_1_2023;

public class Tetrapak extends Ambalaza {

    private boolean daLiSeMozeReciklirati;
    private int osnovnaCena;

    public boolean isDaLiSeMozeReciklirati() {
        return daLiSeMozeReciklirati;
    }

    public void setDaLiSeMozeReciklirati(boolean daLiSeMozeReciklirati) {
        this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }


    public Tetrapak(String barkod, String naziv, int netoTezina, int brutoTezina, boolean daLiSeMozeReciklirati, int osnovnaCena) {
        super(barkod, naziv, netoTezina, brutoTezina);
        this.daLiSeMozeReciklirati = daLiSeMozeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtika() {
        if (daLiSeMozeReciklirati) {
            return racunajTezinu() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + this.barkod + ", " + "Naziv: " + this.naziv +
        ", " + "Neto tezina: " + this.netoTezina + ", " + "Bruto tezina: " +
                this.brutoTezina + ", " + "Da li se reciklira: " + this.daLiSeMozeReciklirati +
                ", " + "Osnovna cena: " + this.osnovnaCena + ", " + "Cena artikla: " +
                this.cenaArtika());

    }
}
