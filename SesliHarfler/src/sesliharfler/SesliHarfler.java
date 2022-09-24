/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesliharfler;

/**
 *
 * @author Dell e7270
 */
public class SesliHarfler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char harf='a';
        switch (harf) {
            case 'A', 'a':
            case 'I', 'ı':
            case 'O', 'o':
            case 'U', 'u':
                System.out.println("Kalın sesli harf");
                break;
            case 'E', 'e':
            case 'İ', 'i':
            case 'Ö', 'ö':
            case 'Ü', 'ü':
                System.out.println("Ince sesli harf");
                break;
            default:
                System.out.println("Sessiz harf girdiniz.");
        }
        
    }
    
}
