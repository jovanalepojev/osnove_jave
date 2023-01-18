package d17_1_2023;

import d10_1_2023.Autor;

public class Zadatak1 {
    public static void main(String[] args) {

        VideoPlayer vp = new VideoPlayer(240,160,23,480);
        TimeControl tc = new TimeControl(240,160,23,480,true);
        AudioControl ac = new AudioControl(240,160,23,480,false);
        QualityOptimizerControl qoc = new QualityOptimizerControl(240,160,23,480,20);

        tc.izvrsiAkciju(vp);
        ac.izvrsiAkciju(vp);
        qoc.izvrsiAkciju(vp);

        System.out.println("VideoPlayer: ");
        vp.stampaj();
        System.out.println(" ");
        System.out.println("TimeControl: ");
        tc.stampaj();
        System.out.println(" ");
        System.out.println("AudioControl: ");
        ac.stampaj();
        System.out.println(" ");
        System.out.println("QualityOptimizerControl: ");
        qoc.stampaj();


    }
}
