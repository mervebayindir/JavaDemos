/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchdemo;

/**
 *
 * @author Dell e7270
 */
public class SwitchDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char grade = 'A';
       
        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B' :
                System.out.println("Cok guzel : Gectiniz");
                break;
            case 'C' :
                System.out.println("Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
    
}
