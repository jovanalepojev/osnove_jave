package d13_1_2023;

public class Ispit {

    private String predmet;
    private int ocena;
    private String imeProfesora;

    public Ispit(String predmet, int ocena, String imeProfesora) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.imeProfesora = imeProfesora;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public boolean polozenIspit(){
        if (ocena>=6 && ocena<=10){
            return true;
        }else {
            return false;
        }
    }

    private void print(){

        System.out.println("(" + this.predmet + ")" + " - " +
                "(" + this.imeProfesora + ")" + " - " +
                "(" + this.ocena + ")");
    }
}
