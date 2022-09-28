/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods2;

/**
 *
 * @author Dell e7270
 */
public class Methods2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mesaj="Bugün hava çok güzel.";
        String sehir=sehirVer();
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi=topla();
        int sayi2=topla2(7,4);
        System.out.println(sayi2);
        int toplam =topla3(1,2,3,4,5,6);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(){
        return 5+6;
    }
    public static int topla2(int sayi1,int sayi2){
        return 5+6;
    }
    public static String sehirVer(){
        return "Antalya";
    }
    public static int topla3(int... sayilar){ //varable arguments ... demek daha fazla deger eklenebılır array gibi
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
