/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniprojeasalsayi;

import java.util.Scanner;

/**
 *
 * @author Dell e7270
 */
public class MiniProjeAsalSayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner reader=new Scanner(System.in);
//        System.out.println("Sayiyi giriniz : ");
        int number=1;
        //int remainder=number % 2;
        //System.out.println(remainder);
        boolean isPrime =true;
        if (number==1) {
            System.out.println("Sayi asal degildir.");
            return;
        }
        if (number<1) {
            System.out.println("Gecersiz sayi");
        }
        for (int i = 2; i < number; i++) {
            if (number %i == 0) {
                isPrime=false;
            }
        }
        if (isPrime== true) {
            System.out.println("Sayi asaldir.");
        }
        else{
            System.out.println("Sayi asal degildir");
        }
        
    }
    
}
