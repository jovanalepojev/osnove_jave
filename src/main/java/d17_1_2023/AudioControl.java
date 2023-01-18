package d17_1_2023;

public class AudioControl extends Control {

    private boolean podesavanjeJacine;
    public AudioControl(int duzina, int trenutnoVreme, int jacina, int kvalitet, boolean podesavanjeJacine) {
        super(duzina, trenutnoVreme, jacina, kvalitet);
        this.podesavanjeJacine=podesavanjeJacine;
    }

    public boolean isPodesavanjeJacine() {
        return podesavanjeJacine;
    }

    public void setPodesavanjeJacine(boolean podesavanjeJacine) {
        this.podesavanjeJacine = podesavanjeJacine;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (this.jacina>100) {
            this.jacina=100;
        } else if (this.jacina<0){
            this.jacina=0;
        }
        if(this.podesavanjeJacine==true){
            this.jacina= this.jacina+1;
        } else {
            this.jacina= this.jacina-1;
        }


    }
}
