package d16_1_2023;

public class Igrac extends Osoba {

    private int broj;
    private String pozicija;
    private boolean daLiJeKapiten;

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija,boolean daLiJeKapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj=broj;
        this.pozicija=pozicija;
        this.daLiJeKapiten=daLiJeKapiten;
    }
    private void Igrac(){

    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }
    @Override
    public void stampaj(){
        System.out.println("Igrac: ");
        super.stampaj();
        System.out.println("Broj igraca: " + this.broj);
        System.out.println("Pozicija igraca: " + this.pozicija);
        System.out.println("Da li je kapiten: " + this.daLiJeKapiten);
    }
}
