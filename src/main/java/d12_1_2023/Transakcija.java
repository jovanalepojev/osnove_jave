package d12_1_2023;

public class Transakcija {

    private int id;
    private Racun uplatilac;
    private Racun primalac;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Racun getUplatilac() {
        return uplatilac;
    }

    public void setUplatilac(Racun uplatilac) {
        this.uplatilac = uplatilac;
    }

    public Racun getPrimalac() {
        return primalac;
    }

    public void setPrimalac(Racun primalac) {
        this.primalac = primalac;
    }

    public Transakcija(int id, Racun uplatilac, Racun primalac) {
        this.id = id;
        this.uplatilac = uplatilac;
        this.primalac = primalac;
    }

    private int provizija(int visinaTransakcije){

        if (visinaTransakcije<4500) {
            return 45;
        } else if (visinaTransakcije>4500) {
            return visinaTransakcije / 100;
        }
        return 0;
    }

    public void izvrsiTransakciju(int vrednostTransakcije){

       int novoStanje = (vrednostTransakcije + provizija(vrednostTransakcije));
       this.uplatilac.promeniStanje(-novoStanje);
       this.primalac.promeniStanje(vrednostTransakcije);
    }
    public void print(){
        System.out.println("Racun sa: " + this.uplatilac.getImeIPrezime() + " " +  this.uplatilac.getBroj());
        System.out.println("Racun na: " + this.primalac.getImeIPrezime() + " " + this.primalac.getBroj());
    }




}
