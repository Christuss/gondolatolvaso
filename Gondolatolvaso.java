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
        for (int i = 0; i < pakli.length; i++) {
            for (String szin : szinek) {
                if (szin != "M") {
                    for (String ertek : ertekek) {
                        pakli[i] = szin + ertek;
                    }
                }else{
                    for (int j = 0; j < 3; j++) {
                        pakli[i] = szin + ertekek[j];
                    }
                }

            }

        }
        for(int i = 0; i < pakli.length; i++) {
            System.out.println(pakli[i]);
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
