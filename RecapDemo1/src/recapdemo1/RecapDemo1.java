/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recapdemo1;

/**
 *
 * @author Dell e7270
 */
public class RecapDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi1=25;
        int sayi2=20;
        int sayi3=21;
        int enBuyuk=sayi1;
        if (enBuyuk<sayi2) {
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3) {
            enBuyuk=sayi3;
        }
        System.out.println("En buyuk = " +  enBuyuk);
        
        
        
        /*if (sayi1>sayi2 && sayi1>sayi3) {
            System.out.println("Sayi1 buyuktur.");
        }
        else if(sayi2>sayi1 && sayi2>sayi3){
            System.out.println("sayi2 buyuktur");
        }
        else{
            System.out.println("sayi3 buyuktur");
        }*/
    }
    
}
