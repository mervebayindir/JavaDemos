/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author Dell e7270
 */
public class BaseKrediManager {
    //public final double hesapla(){} ile hiç kimse bu metofu ezemez anlamaına gelir ==> final
    public double hesapla(double tutar){
        return tutar * 1.18;
        
    }
}
