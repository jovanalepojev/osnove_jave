package d10_1_2023;

public class Proizvod {

    private String naziv;
    private int cenaIzrade;
    private Kupac kupac;

    public void setKupac(Kupac kupac) {
        this.kupac=kupac;
    }

    public Proizvod(String naziv, int cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public double cenaProizvoda() {
        return cenaIzrade * 1.9 * (100- this.kupac.getKartica().getPopust()) / 100;
    }
    public void print(){
        System.out.println(this.naziv + " - " + cenaProizvoda());
        System.out.println(this.kupac.getImeIPrezime() + " - "  + this.kupac.getKartica().getBroj());
    }




}


