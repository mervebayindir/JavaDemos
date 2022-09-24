/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopdemo;

/**
 *
 * @author Dell e7270
 */
public class LoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //for
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Dongu bitti.");

        //while
        int j=2;
        while (j <= 10) {
            System.out.println(j);
            j+=2;
        }
        System.out.println("While dongusu bitti");
        
        //Do - While
        int k=1;
        do {            
            System.out.println(k);
            k+=2;
        } while (k<=10);
        System.out.println("Do - While dongusu bitti");
    }

}
