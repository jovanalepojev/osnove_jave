package d17_1_2023;

public class TimeControl extends Control {

    private boolean pomeranjeVidea;

    public TimeControl(int duzina, int trenutnoVreme, int jacina, int kvalitet, boolean pomeranjeVidea) {
        super(duzina, trenutnoVreme, jacina, kvalitet);
        this.pomeranjeVidea=pomeranjeVidea;
    }


    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.trenutnoVreme>this.duzina) {
            this.trenutnoVreme=this.duzina;
        }
        if (this.pomeranjeVidea==true) {
            this.trenutnoVreme = this.trenutnoVreme + 15;
        } else {
            this.trenutnoVreme = this.trenutnoVreme - 15;
        }


    }

}
