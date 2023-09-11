package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {
    
    String[] pakli = new String[22];

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new gondolatolvaso.Gondolatolvaso().kirak();
    }

    public void kirak() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; i < 22 && e < ertekek.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }

        for (int j = 0; j < 3; j++) {
            for (int f = 1; f < pakli.length; f++) {
                if (f % 3 == 1) {
                    System.out.println();
                }
                System.out.print(pakli[f] + "  ");
            }
            System.out.println("");
            melyik();
        }

    }

    public void melyik() {
        boolean jo;
        do {
            System.out.print("Melyik oszlop (1-3): ");
            int oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
            kever(oszlop);
        } while (!jo);
    }

    public void kever(int oszlop) {
        switch (oszlop) {
            case 2:
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[19 - (i - 1) * 3];
                    pakli[i+7] = pakli[20 - (i - 1) * 3];
                    pakli[i+14] = pakli[21 - (i - 1) * 3];
                }
                break;
                
            case 3:
                for (int i = 1; i < 7; i++) {
                    pakli[i] = pakli[21 - (i - 1) * 3];
                    pakli[i+7] = pakli[20 - (i - 1) * 3];
                    pakli[i+14] = pakli[19 - (i - 1) * 3];
                }
                break;
        }

    }

}
