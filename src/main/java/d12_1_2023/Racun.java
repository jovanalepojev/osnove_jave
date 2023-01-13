package d12_1_2023;

public class Racun {
    private String broj;
    private String imeIPrezime;
    private int stanje;



    public String getBroj() {
        return broj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getStanje() {
        return stanje;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Racun(String broj, String imeIPrezime, int stanje) {
        this.broj = broj;
        this.imeIPrezime = imeIPrezime;
        this.stanje = stanje;
    }
    public void promeniStanje(int vrednostTransakcije) {

        if (this.stanje+vrednostTransakcije<0){
            System.out.println("Nemate dovoljno sredstava na racunu!");
        } else {
            this.stanje = this.stanje + vrednostTransakcije;
        }
    }
    public void print(){
        System.out.println(this.imeIPrezime + " - " + this.broj);
        System.out.println("Stanje na racunu je: "+ this.stanje + ".rsd");

    }

}
