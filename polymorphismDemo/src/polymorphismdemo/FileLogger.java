/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismdemo;

/**
 *
 * @author Dell e7270
 */
public class FileLogger extends BaseLogger {
    public void log(String message){
        System.out.println("Logged to file : " + message);
    }
}
