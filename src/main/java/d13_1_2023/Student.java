package d13_1_2023;

import java.util.ArrayList;

public class Student {


    private String brIndeksa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(String brIndeksa, String imeIPrezime, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispit> getIspit() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispit) {
        this.ispiti.add(ispit);
    }

    public int prosek() {
        int counterOcene = 0;
        int counterIspiti = 0;
        int avg = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozenIspit()==true) {
                counterIspiti++;
                counterOcene = counterOcene + this.ispiti.get(i).getOcena();
            }
        }
        avg = counterOcene / counterIspiti;
        return avg;
    }

    public void print() {
        System.out.println(this.brIndeksa + " - " + this.imeIPrezime + " - " + this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getPredmet() + " - " + this.ispiti.get(i).getImeProfesora() +
                    " - " + this.ispiti.get(i).getOcena());

        }
        System.out.println("Prosecna ocena: " + this.prosek());
    }
}
