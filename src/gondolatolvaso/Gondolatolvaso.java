package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    String[] pakli = new String[22];
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Gondolatolvaso gondolatolvaso = new gondolatolvaso.Gondolatolvaso();
        gondolatolvaso.feltolt();
        for (int i = 0; i < 3; i++) {
            gondolatolvaso.kirak();
            gondolatolvaso.melyik();
        }
        gondolatolvaso.ezVolt();
    }
    
    public void feltolt(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; i < 22 && e < ertekek.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }
    }
    
    public void kirak() {
                
        for (int j = 1; j < 22; j++) {
            System.out.printf("%10s",pakli[j]);
            if (j % 3 == 0) {
                System.out.println();
            }
            
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
        String[] ujpakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujpakli[i] = pakli[20 - (i - 1) * 3];
                    ujpakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujpakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujpakli[i] = pakli[19 - (i - 1) * 3];
                    ujpakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujpakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujpakli[i] = pakli[19 - (i - 1) * 3];
                    ujpakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujpakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujpakli;
    }
    
    public void ezVolt(){
        System.out.println("A választott lap: %s".formatted(pakli[11]));
    }
}
