package d13_1_2023;

public class Zadatak1 {
//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)
//
//
//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)
    public static void main(String[] args) {

        Ispit i1 = new Ispit("Sociologija",7,"Dijana Milosevic");
        Ispit i2 = new Ispit("Pedagogija",8,"Milos Milosevic");
        Ispit i3 = new Ispit("Psihologija",8,"Milos Milosevic");
        Student s1 = new Student("9852/14","Marko Markovic", "Osnovne" );


        Ispit i4 = new Ispit("Sociologija",9,"Dijana Milosevic");
        Ispit i5 = new Ispit("Pedagogija",10,"Milos Milosevic");
        Ispit i6 = new Ispit("Psihologija",10,"Milos Milosevic");
        Student s2 = new Student("5814/14","Maja Janjic", "Osnovne" );


        s1.dodajIspit(i1);
        s1.dodajIspit(i2);
        s1.dodajIspit(i3);
        s2.dodajIspit(i4);
        s2.dodajIspit(i5);
        s2.dodajIspit(i6);

        s1.print();
        s2.print();








    }
}
