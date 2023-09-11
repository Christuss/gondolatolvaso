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
        for(i = 0; i < pakli.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
            }
            System.out.print(pakli[i]+" ");
        }
    }

    public int melyik() {
        int melyikOszlop = sc.nextInt();
        return melyikOszlop;
    }

    public void kever() {

    }

    public void ezVolt(String kartya) {
        System.out.println(kartya);
    }

}
