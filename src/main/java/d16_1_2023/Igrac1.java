package d16_1_2023;

import java.util.ArrayList;

public class Igrac1 extends Osoba1{
    private int broj;
    private String pozicija;
    ArrayList<Karton>kartoni;
    private boolean kapiten;

    public Igrac1(){

    }
    public Igrac1(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
        this.kartoni = new ArrayList<>();
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

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton karton){
        this.kartoni.add(karton);
    }
    public int brojZutih() {
        int zuti = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("zuti")) {
                zuti++;
            }
        }
        return zuti;
        }

    public int brojCrvenih() {
        int crveni = 0;
        for (int i = 0; i < kartoni.size(); i++) {
            if (this.kartoni.get(i).getTip().equals("crveni")) {
                crveni++;
            }

        }
        return crveni;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("Broj igraca: " + this.broj);
        System.out.println("Pozicija igraca: " + this.pozicija);
        System.out.println("Da li je kapiten: " + this.kapiten);
        System.out.println("Broj zutih: " + brojZutih());
        System.out.println("Broj crvenih: " + brojCrvenih());

    }


}
