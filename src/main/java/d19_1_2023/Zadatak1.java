package d19_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Korpa k1 = new Korpa();
        SuperKartica sk1 = new SuperKartica(2566,"Marko Markovic", 120);

        k1.dodajAmbalazu(new Tetrapak("878-518","Mleko",15,35,true,25));
        k1.dodajAmbalazu(new Tetrapak("935-745","Sok",25,63,false,40));
        k1.dodajAmbalazu(new Tetrapak("425-56518","Jogurt",33,54,true,71));
        k1.dodajAmbalazu(new StaklenaAmbalaza("555-65815","Voda",350,480,50,true,60));
        k1.dodajAmbalazu(new StaklenaAmbalaza("863584-618285","Vino",270,410,0,false,170));
        k1.dodajAmbalazu(new StaklenaAmbalaza("62828-88585","Coca-Cola",250,360,0,false,90));

        k1.izbaciAmblazu("878-518");
        System.out.println("Ukupna cena: " + k1.ukupnaCenaKorpe(sk1));













    }
}
