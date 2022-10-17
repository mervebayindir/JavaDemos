/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractdemo;

/**
 *
 * @author Dell e7270
 */
public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CustomerManager customerManager=new CustomerManager();
       customerManager.databaseManager=new MySqlDatabaseManager();
       customerManager.getCustomer();
    }
    
}
