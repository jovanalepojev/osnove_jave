package d19_1_2023;

public class SuperKartica {
    private int broj;
    private String imeVlasnika;
    private int popust;

    public SuperKartica(){

    }

    public SuperKartica(int broj, String imeVlasnika, int popust) {
        this.broj = broj;
        this.imeVlasnika = imeVlasnika;
        this.popust = popust;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getImeVlasnika() {
        return imeVlasnika;
    }

    public void setImeVlasnika(String imeVlasnika) {
        this.imeVlasnika = imeVlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stapaj(){
        System.out.println("(" + this.broj + ")" + " " + "(" + this.imeVlasnika + ")");
    }

}
