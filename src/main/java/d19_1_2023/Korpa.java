package d19_1_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza>ambalaze;

    public Korpa() {
        this.ambalaze = new ArrayList<Ambalaza>();
    }
    public void dodajAmbalazu(Ambalaza a){
        ambalaze.add(a);
    }
    public void izbaciAmblazu(String barKod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarkod().equalsIgnoreCase(barKod)) {
                ambalaze.remove(i);
            }
        }
    }

    private double cenaSvihAmbalaza(int popust){
        double cenaSvih = 0;
        for (int i = 0; i< ambalaze.size(); i++){
            cenaSvih = cenaSvih + ambalaze.get(i).cenaArtika();

        }
        return cenaSvih-popust;
    }
    public double ukupnaCenaKorpe(SuperKartica superKartica) {

        double ukupnaCena = cenaSvihAmbalaza(superKartica.getPopust());
        return ukupnaCena;
    }

}
