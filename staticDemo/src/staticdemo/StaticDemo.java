/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticdemo;

/**
 *
 * @author Dell e7270
 */
public class StaticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.price=10;
        product.name="Mause";
        manager.add(product);
        
//        ProductValidator productValidator=new ProductValidator();
//        productValidator.bisey();
    }

}
