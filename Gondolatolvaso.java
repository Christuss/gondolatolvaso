
package gondolatolvaso;

import java.util.Scanner;


public class Gondolatolvaso {

    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        
    }
    
    public void kirak(String[] kartyak) {
        for (String kartya : kartyak) {
            System.out.print(kartya + " ");
        }
        System.out.println();
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
