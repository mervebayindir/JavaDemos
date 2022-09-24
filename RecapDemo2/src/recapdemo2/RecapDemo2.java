/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recapdemo2;

/**
 *
 * @author Dell e7270
 */
public class RecapDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] myList={1.2,1.3,4.3,5.6};
        double total=0;
        double max=myList[0];
        for(double number:myList){
            if (max<number) {
                max=number;
                
            }
            total+=number;
            System.out.println(number);
        }
        System.out.println("Toplam esittir = " + total);
        System.out.println("En buyuk sayi = " + max);
    }
    
}
