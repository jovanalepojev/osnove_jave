package d12_1_2023;

import p12_1_2023.Sastojak;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//    kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//            (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

    public static void main(String[] args) {
        ArrayList<ZeleniKarton> zeleniKarton = new ArrayList<ZeleniKarton>();
        Scanner s = new Scanner(System.in);

        for (int i=0; i<=9; i++){
            System.out.print("Unesite ime i prezime studenta: ");
            String student = s.next();
            System.out.print("Unesite broj indeksa: ");
            String index = s.next();
            System.out.print("Unesite naziv predmeta: ");
            String predmet = s.next();
            System.out.print("Unesite ime i prezime profesora: ");
            String profesor = s.next();
            System.out.print("Unesite ocenu: ");
            int ocena = s.nextInt();

            ZeleniKarton x = new ZeleniKarton(student, index, predmet, profesor, ocena);
            zeleniKarton.add(x);
        }

        int brojPolozenih = 0;
        int zbirOcena=0;
        int brojPolozenih2 = 0;
        int zbirOcena2=0;

        for (int i=0; i<zeleniKarton.size();i++){
            zeleniKarton.get(i).print();
          System.out.println(zeleniKarton.get(i).getNazivPredmeta() + "- " + zeleniKarton.get(i).getOcena()+ '\n' +
                  zeleniKarton.get(i).getImeIPrezime() + zeleniKarton.get(i).getBrojIndeksa() + zeleniKarton.get(i).getImeProfesora());
          brojPolozenih2++;
          zbirOcena2 = zeleniKarton.get(i).getOcena() +zbirOcena2;


            if (zeleniKarton.get(i).getOcena()>5 && zeleniKarton.get(i).getOcena()<=10) {
                brojPolozenih++;
                zbirOcena= zeleniKarton.get(i).getOcena() + zbirOcena;

            }

        }
        double avg = zbirOcena/brojPolozenih;
        System.out.println("Prosecna ocena za polozene ispite je: " + avg);
        double avg2 = zbirOcena2/brojPolozenih2;
        System.out.println("Prosecna ocena svih ispita je" + avg2);

    }
}
