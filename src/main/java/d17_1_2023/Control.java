package d17_1_2023;

public abstract class Control extends VideoPlayer {

    public Control(int duzina, int trenutnoVreme, int jacina, int kvalitet) {
        super(duzina, trenutnoVreme, jacina, kvalitet);
    }

    public abstract void izvrsiAkciju(VideoPlayer videoPlayer);
}
