/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mukemmelsayi;

/**
 *
 * @author Dell e7270
 */
public class MukemmelSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 6;
        int total =0;
        for (int i = 1; i < number; i++) {
            if (number % i== 0) {
                total += i ;
            }
        }
        if (total == number) {
            System.out.println("Mukemmel sayidir.");
        }
        else{
            System.out.println("Mukemmel sayi degildir.");
        }
 
    }   
}
