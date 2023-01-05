package d29_12_2022;

public class SmartAirConditioning {

    private String marka;
    private int potrosnjaHladi;
    private int potrosnjaGreje;
    private int temperatura;
    private String mod;

    public String getMarka() {
        return marka;
    }

    public int getPotrosnjaHladi() {
        return potrosnjaHladi;
    }

    public int getPotrosnjaGreje() {
        return potrosnjaGreje;
    }
    public String getMod() {
        return mod;
    }

    public void setMarka(String marka){
        this.marka= marka;
    }
    public void setPotrosnjaHladi(int potrosnjaHladi){
        this.potrosnjaHladi=potrosnjaHladi;
    }
    public void setPotrosnjaGreje(int potrosnjaGreje){
        this.potrosnjaGreje=potrosnjaGreje;
    }
    public void setMod(String mod){
        this.mod=mod;
    }

    public int getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(int temperatura){
        if (temperatura<=35 && temperatura>=16) {
            this.temperatura = temperatura;
        }
    }

    public void stampaj() {
        System.out.println(marka + " - " + mod + " - " + temperatura);
    }

    public int mesecnaPotrosnja(String mod) {

        if (mod.equalsIgnoreCase("greje")) {
         return 30*15*potrosnjaGreje;
        } else if (mod.equalsIgnoreCase("hladi")) {
           return  30 * 15 * potrosnjaHladi;
        }
        return 0;
    }

    public int cena(String mod) {

        int potrosnja = mesecnaPotrosnja(mod);

        if (potrosnja<=350) {
            return potrosnja * 6;
        } else {

            return ((potrosnja-350) * 9) + 350*6;
        }
    }
}
