package d10_1_2023;

public class Knjiga {

    private String isbn;
    private String naziv;
    private String godinaIzdanja;
    private Autor jeNapisao;

    public void setJeNapisao(Autor jeNapisao) {
        this.jeNapisao = jeNapisao;
    }

    public Knjiga(String isbn, String naziv, String godinaIzdanja) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(String godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void print(){

        if (this.jeNapisao!=null) {

            System.out.println("(" + this.isbn + ")" + '\n' +
                    "(" + this.naziv + ")" + " " + "(" + this.godinaIzdanja + ")" + '\n' +
                    "(" + this.jeNapisao.getIme() + ")" + " " + "(" + this.jeNapisao.getPrezime() + ")");
            System.out.println("");
        }


    }
}
