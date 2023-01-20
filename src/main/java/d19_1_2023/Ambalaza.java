package d19_1_2023;

public abstract class Ambalaza {

    protected String barkod;
    protected String naziv;
    protected int netoTezina;
    protected int brutoTezina;


    public Ambalaza(){

    }

    public Ambalaza(String barkod, String naziv, int netoTezina, int brutoTezina) {
        this.barkod = barkod;
        this.naziv = naziv;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double racunajTezinu(){
        int tezinaPakovanja = 0;
        tezinaPakovanja= this.brutoTezina - this.netoTezina;
        return tezinaPakovanja;
    }
    public abstract double cenaArtika();
    public abstract void stampaj();
}
