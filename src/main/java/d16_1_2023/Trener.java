package d16_1_2023;

import java.sql.Struct;

public class Trener extends Osoba {

    private int godineIskustva;
    private String tipTrenera;

    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva=godineIskustva;
        this.tipTrenera=tipTrenera;
    }
    @Override
    public void stampaj() {
        System.out.println("Trener: ");
        super.stampaj();
        System.out.println("Godine iskustva: " + this.godineIskustva);
        System.out.println("Tip trenera: " + this.tipTrenera);
    }
}
