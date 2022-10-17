/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author Dell e7270
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
        //ICustomerDal customerDal=new OracleCustomerDal();
    }
    
}
