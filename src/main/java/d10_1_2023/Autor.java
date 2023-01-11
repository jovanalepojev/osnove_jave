package d10_1_2023;

public class Autor {

    private String ime;
    private String prezime;

    public Autor(String ime, String prezime) {
        this.ime = ime;
        this.prezime=prezime;
    }

    public String getImeIPrezime() {
        return ime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.ime = imeIPrezime;

    }
    public void print() {
        System.out.println("(" + this.ime + ")" + " " + "(" + this.prezime + ")"  );

    }
}
