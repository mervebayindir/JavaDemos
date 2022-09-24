/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author Dell e7270
 */
public class ArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Merve";
        ogrenciler[1] = "Zumra";
        ogrenciler[2] = "Kutluhan";
        
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-------------------");
        
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }

}
