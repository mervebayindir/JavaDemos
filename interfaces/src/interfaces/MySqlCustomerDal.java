/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Dell e7270
 */
public class MySqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void Add() {
        System.out.println("My Sql'e eklendi");
    }
    
}
