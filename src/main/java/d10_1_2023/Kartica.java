package d10_1_2023;

public class Kartica {

    private int popust;
    private int broj;

    public Kartica(int popust, int broj) {
        if (popust>=5 && popust<=10) {
            this.popust = popust;
        }
        this.broj = broj;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }
}
