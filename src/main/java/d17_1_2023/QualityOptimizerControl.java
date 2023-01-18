package d17_1_2023;

public class QualityOptimizerControl extends Control {

    private double brzinaInterneta;

    public QualityOptimizerControl(int duzina, int trenutnoVreme, int jacina, int kvalitet, double brzinaInterneta) {
        super(duzina, trenutnoVreme, jacina, kvalitet);
        this.brzinaInterneta=brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        this.kvalitet = this.brzinaInterneta*10.1;
        if (this.kvalitet>=204 && this.kvalitet<505){
            this.kvalitet=240;
        } else if (this.kvalitet>=505) {
            this.kvalitet=720;
        } else if (this.kvalitet>= 50.5 && this.kvalitet<204) {
            this.kvalitet=144;
        }

    }
}
