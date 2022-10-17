/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

/**
 *
 * @author Dell e7270
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), 
            new TarimKrediManager(), new OgrenciKrediManager()};
        for(BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

//        OgretmenKrediManager ogretmenKrediManager =new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.hesapla(1000));
    }
    
}
