package d10_1_2023;

public class Kupac {
    private String imeIPrezime;
    private Kartica kartica;

    public Kupac(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;

    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setKartica(Kartica kartica) {
        this.kartica = kartica;
    }

    public Kartica getKartica() {
        return kartica;
    }

    public void print() {

        System.out.println(this.imeIPrezime + " - " + this.getKartica().getBroj());
    }




}
