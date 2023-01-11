package d10_1_2023;

public class Zadatak1 {

//    Kreirati klasu Autor koja ima
//-ime i prezime
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu:
//            (ime autora) (prezime autora)
//
// Kreirati klasu Knjiga koji ima:
// -ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//            (ISBN)
//            (naziv) - (godina izdanja)
//    autor: (ime autora) (prezime autora)
//
//    U glavnom programu napraviti vise autora sa vise knjiga.



    public static void main(String[] args) {

        Knjiga k1 = new Knjiga( "986245836","The Green Mile", "1996");
        Autor a1 = new Autor("Stephen", "King");

        k1.setJeNapisao(a1);
        k1.print();

        Knjiga k2 = new Knjiga("65879624", "Fire & Blood", "2018");
        Autor a2 = new Autor("George R. R.", "Martin");

        k2.setJeNapisao(a2);
        k2.print();


    }
}
