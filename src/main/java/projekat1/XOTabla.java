package projekat1;

import java.util.ArrayList;

public class XOTabla {
    ArrayList<String>polja = new ArrayList<String>();

    private String polje1 = " ";
    private String polje2 = " ";
    private String polje3 = " ";
    private String polje4 = " ";
    private String polje5 = " ";
    private String polje6 = " ";
    private String polje7 = " ";
    private String polje8 = " ";
    private String polje9 = " ";
    private String imeIgracaX;
    private String imeIgracaO;
    private String naPotezu;


    public String getImeIgracaX() {
        return this.imeIgracaX;
    }
    public String getImeIgracaO() {
        return this.imeIgracaO;
    }
    public String getNaPotezu() {
        return this.naPotezu;
    }

    public void setImeIgracaX(String ime) {
        imeIgracaX=ime;
    }
    public void setImeIgracaO(String ime) {
        imeIgracaO=ime;
    }

    public void pokreniIgru() {
        polja.add(polje1);
        polja.add(polje2);
        polja.add(polje3);
        polja.add(polje4);
        polja.add(polje5);
        polja.add(polje6);
        polja.add(polje7);
        polja.add(polje8);
        polja.add(polje9);

        naPotezu="X";
    }

    public void stampaj() {
        System.out.println(polja.get(0) + " | " + polja.get(1) + " | " + polja.get(2) );
        System.out.println(polja.get(3) + " | " + polja.get(4) + " | " + polja.get(5) );
        System.out.println(polja.get(6) + " | " + polja.get(7) + " | " + polja.get(8) );

        System.out.println("Igrac X: " + imeIgracaX);
        System.out.println("Igrac O: " + imeIgracaO);
    }
    public boolean poljePrazno(int indexPolja) {
        String polje = polja.get(indexPolja-1);

        if (polje.equals(" ")) {
            return true;
        } else {
            return false;
        }

    }

    public void zameniIgraca() {
        if (naPotezu.equalsIgnoreCase("X")) {
            naPotezu = "O";
        } else {
            naPotezu= "X";
        }
    }

    public void odigrajPotez(int indexPolja) {

        polja.set(indexPolja-1, naPotezu);

    }

    public boolean popunjenaTabela() {

        for (int i=0; i<polja.size(); i++) {

            if (polja.get(i).equals(" ")) {
                return false;
            }
        }
        return true;
    }

    public boolean pobednikX() {

        if (polja.get(0).equalsIgnoreCase("X") && polja.get(1).equalsIgnoreCase("X") &&
                polja.get(2).equalsIgnoreCase("X")) {
            return true;
        } else if (polja.get(3).equalsIgnoreCase("X") && polja.get(4).equalsIgnoreCase("X") &&
                polja.get(5).equalsIgnoreCase("X")) {
            return true;
        } else if (polja.get(6).equalsIgnoreCase("X") && polja.get(7).equalsIgnoreCase("X") &&
                polja.get(8).equalsIgnoreCase("X")) {
            return true;
        } else if (polja.get(0).equalsIgnoreCase("X") && polja.get(3).equalsIgnoreCase("X") &&
                polja.get(6).equalsIgnoreCase("X")) {
            return true;
        } else if (polja.get(1).equalsIgnoreCase("X") && polja.get(4).equalsIgnoreCase("X") &&
                polja.get(7).equalsIgnoreCase("X")) {
            return true;
        } else if (polja.get(2).equalsIgnoreCase("X") && polja.get(5).equalsIgnoreCase("X") &&
                polja.get(8).equalsIgnoreCase("X")) {
            return true;
        } else if (polja.get(6).equalsIgnoreCase("X") && polja.get(4).equalsIgnoreCase("X") &&
                polja.get(2).equalsIgnoreCase("X")) {
            return true;
        } else if (polja.get(0).equalsIgnoreCase("X") && polja.get(4).equalsIgnoreCase("X") &&
                polja.get(8).equalsIgnoreCase("X")) {
            return true;
        }
        return false;

    }
    public boolean pobednikO() {

        if (polja.get(0).equalsIgnoreCase("O") && polja.get(1).equalsIgnoreCase("O") &&
                polja.get(2).equalsIgnoreCase("O")) {
            return true;
        } else if (polja.get(3).equalsIgnoreCase("O") && polja.get(4).equalsIgnoreCase("O") &&
                polja.get(5).equalsIgnoreCase("O")) {
            return true;
        } else if (polja.get(6).equalsIgnoreCase("O") && polja.get(7).equalsIgnoreCase("O") &&
                polja.get(8).equalsIgnoreCase("O")) {
            return true;
        } else if (polja.get(0).equalsIgnoreCase("O") && polja.get(3).equalsIgnoreCase("O") &&
                polja.get(6).equalsIgnoreCase("O")) {
            return true;
        } else if (polja.get(1).equalsIgnoreCase("O") && polja.get(4).equalsIgnoreCase("O") &&
                polja.get(7).equalsIgnoreCase("O")) {
            return true;
        } else if (polja.get(2).equalsIgnoreCase("O") && polja.get(5).equalsIgnoreCase("O") &&
                polja.get(8).equalsIgnoreCase("O")) {
            return true;
        } else if (polja.get(6).equalsIgnoreCase("O") && polja.get(4).equalsIgnoreCase("O") &&
                polja.get(2).equalsIgnoreCase("O")) {
            return true;
        } else if (polja.get(0).equalsIgnoreCase("O") && polja.get(4).equalsIgnoreCase("O") &&
                polja.get(8).equalsIgnoreCase("O")) {
            return true;
        }
        return false;
    }
}
