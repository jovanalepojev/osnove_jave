package d12_1_2023;

public class ZeleniKarton {

    private String imeIPrezime;
    private String brojIndeksa;
    private String nazivPredmeta;
    private String imeProfesora;
    private int ocena;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String imeIPrezime, String brojIndeksa, String nazivPredmeta, String imeProfesora, int ocena) {
        this.imeIPrezime = imeIPrezime;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeProfesora = imeProfesora;
        this.ocena = ocena;
    }

    public boolean polozioIspit(){

        if (ocena>5 && ocena<=10){
            return true;
        } else {
            return false;
        }
    }


    public void print(){
        System.out.println("(" + this.nazivPredmeta + ")" + " - " + this.ocena + '\n' +
                "Student: " + this.imeIPrezime + ", " + this.brojIndeksa + '\n'+
                "Profesor: " +  this.imeProfesora);

    }



}
