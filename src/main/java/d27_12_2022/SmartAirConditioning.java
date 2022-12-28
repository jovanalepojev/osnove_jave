package d27_12_2022;

public class SmartAirConditioning {
    public String marka;
    public int temperatura;
    public String mod;

    public void stampa () {
        System.out.println("*Model: " + this.marka + '\n' + "*Temperatura: " + this.temperatura
                + " stepeni" + '\n' + "*Mod: " + this.mod);
    }

    public boolean vracaTemperaturu (int temperaturaNapolju) {

        if (temperatura < temperaturaNapolju) {
            return true;
        } else {
            return false;
        }

    }

}
