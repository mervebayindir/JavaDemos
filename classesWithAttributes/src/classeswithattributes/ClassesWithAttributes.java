/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classeswithattributes;

/**
 *
 * @author Dell e7270
 */
public class ClassesWithAttributes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product product=new Product(1, "Laptop","Asus Laptop", 3000, 2, "Siyah");
        
        Product product2 = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus  Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("Siyah");
        
        
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        
        System.out.println(product.getKod());       
        
        
        //System.out.println(product.name);
    }
    
}
