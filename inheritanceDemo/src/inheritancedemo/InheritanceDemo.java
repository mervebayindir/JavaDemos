/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author Dell e7270
 */
public class InheritanceDemo {

    private static OgretmenKrediManager ogretmenKrediManager;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        
//        OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
//        ogretmenKrediManager.Hesapla();
    }
    
}
