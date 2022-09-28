/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author Dell e7270
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sayiBulmaca();
        
    } 
    
    public static void sayiBulmaca(){
     int[] sayilar=new int[]{1,2,5,7,9,0};
       int aranacak=5;
       boolean varMi=false;
        for (int sayi:sayilar) {
            if (sayi==aranacak) {
                varMi=true;
                break;
            }
        }
        if (varMi) {
                mesajVer("Sayı mevcuttur."+ aranacak);
            }
            else{
                System.out.println("Sayi mevcut değildir." + aranacak);
            }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
