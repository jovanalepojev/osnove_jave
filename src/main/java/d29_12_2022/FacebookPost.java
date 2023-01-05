package d29_12_2022;

public class FacebookPost {

    private String imeIPrezime;
    private String imeIPrezimeGdeJeObjavljenPost;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;

    public String getImeIPrezime() {
        return this.imeIPrezime;
    }
    public String getImeIPrezimeGdeJeObjavljenPost() {
        return this.imeIPrezimeGdeJeObjavljenPost;
    }
    public String getTekstObjave() {
        return this.tekstObjave;
    }

    public int getBrojLajkova() {
        return brojLajkova;
    }

    public int getBrojDeljenja() {
        return brojDeljenja;
    }

    public void setImeIPrezime(String imeIPrezimeKorisnika){
        this.imeIPrezime=imeIPrezimeKorisnika;
    }
    public void setImeIPrezimeGdeJeObjavljenPost(String imeIPrezimeGdeJeObjavljenPost){
        this.imeIPrezimeGdeJeObjavljenPost=imeIPrezimeGdeJeObjavljenPost;
    }
    public void setTekstObjave(String tekstObjave){
        this.tekstObjave=tekstObjave;
    }

    public void like() {
        brojLajkova++;
    }
    public void dislike() {
        brojLajkova--;
        if (brojLajkova<0){
            brojLajkova=0;
        }
    }
    public void share() {
        brojDeljenja++;
    }
    public void print() {
        System.out.println(   "(" + imeIPrezime + ") " + " >>> " +
                "(" + imeIPrezimeGdeJeObjavljenPost + ")");
        System.out.println("(" + tekstObjave + ")");
        System.out.println("Likes " + brojLajkova + " | " + "Share: " + brojDeljenja);


    }








}

