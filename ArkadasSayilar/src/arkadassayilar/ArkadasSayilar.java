/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arkadassayilar;

/**
 *
 * @author Dell e7270
 */
public class ArkadasSayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //220-284
        int sayi1=222;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        for (int i = 1; i < sayi1; i++) {
            if (sayi1%1==0) {
                toplam1+=i;              
            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2%1==0) {
                toplam2+=i;              
            }
        }
        if (sayi1==toplam2 && sayi2==toplam1) {
            System.out.println("Bu iki sayi arkadastır.");
        }
        else{
            System.out.println("Bu iki sayi arkadas degildir.");
        }
    }
    
}
