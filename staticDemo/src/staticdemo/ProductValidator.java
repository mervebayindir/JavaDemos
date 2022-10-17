/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticdemo;

/**
 *
 * @author Dell e7270
 */
public class ProductValidator {
    
    static{
        System.out.println("Static Yapici blok calisti");
    }
    public ProductValidator() {
        System.out.println("Yapici blok calisti");
    }
    
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void bisey() {
        
    }
    /*public static class BaskaBirClass(){ //inner class
        public static void Sil(){
            
        }
    }*/
}
