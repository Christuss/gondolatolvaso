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
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < pakli.length; i++) {
                if (i % 3 == 0) {
                    System.out.println();
                }
                System.out.print(pakli[i] + "  ");
            }
            int melyikOszlop = melyik();
        }
        
    }

    public int melyik() {
        System.out.print("Melyik oszlop (1-3): ");
        int melyikOszlop = sc.nextInt();
        return melyikOszlop;
    }

    public void kever() {

    }

    public void ezVolt(String kartya) {
        System.out.println(kartya);
    }

}