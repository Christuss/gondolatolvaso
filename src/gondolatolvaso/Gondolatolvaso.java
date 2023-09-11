package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new gondolatolvaso.Gondolatolvaso().kirak();
    }

    public void kirak() {
        String[] pakli = new String[22];
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        
        
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; i < 22 && e < ertekek.length; e++) {
                    pakli[i++] = szin + "_" + ertekek[e];
            }
        }
        
        for (int j = 0; j < 3; j++) {
            for (int f = 0; f < pakli.length; f++) {
                if (f % 3 == 0) {
                    System.out.println();
                }
                System.out.print(pakli[f] + "  ");
            }
            melyik();
        }
        
    }

    public void melyik() {
        boolean jo;
        do {            
            System.out.print("Melyik oszlop (1-3): ");
            int oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
    }

    public void kever() {

    }


    }
