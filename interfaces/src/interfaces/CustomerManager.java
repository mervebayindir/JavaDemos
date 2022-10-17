/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Dell e7270
 */
public class CustomerManager {
    private ICustomerDal customerDal;
    
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    } 
    
    public void add(){
        //iş kodları yazılır.
       customerDal.Add();
    }
}
