/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author Dell e7270
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //referans type
      CustomerManager customerManager =new CustomerManager();
      CustomerManager customerManager2 =new CustomerManager();
      customerManager=customerManager2;
      customerManager.Add();
      customerManager.Remove();
      customerManager.Update();
       int sayi1=10;
       int sayi2=20;
       sayi2=sayi1;
       sayi1=30;
        System.out.println(sayi2);
        
        int[] sayilar=new int[]{1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar;
        sayilar[0]=15;
        System.out.println(sayilar[0]);
    }
    
}
