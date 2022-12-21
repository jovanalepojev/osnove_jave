package d19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
//        Korisnik unosi N rekacija zatim se prikazuje evidencija:
//        Program podrzava sledece reakcije:
//        like
//        smile
//        heart
//
//        Primer izvrsenja:
//        Unesite N: 7
//        Reaguj: like
//        Reaguj: heart
//        Reaguj: smile
//        Reaguj: lol
//        Reaguj: smile
//        Reaguj: like
//        Reaguj: like
//        Summary: like 3 | smile 2 | heart 1

        System.out.print("Unesite N: ");
        int n = s.nextInt();
        int suma = 0;
        int likeCounter = 0;
        int smileCounter = 0;
        int heartCounter= 0;

        for (int i = 0; i < n; i++) {


            System.out.print("Reaguj: ");
            String reakcija = s.next();
            suma = suma + i;

                if (reakcija.contains("like")) {
                    likeCounter = likeCounter + 1;

            } if (reakcija.contains("smile")) {
                smileCounter = smileCounter + 1;

            } if (reakcija.contains("heart")) {
                heartCounter= heartCounter + 1;
            }

            }
              System.out.print("Summary: " + "like " + likeCounter + " | " + "smile " + smileCounter + " | "
                      + "heart " + heartCounter);
            }

        }



