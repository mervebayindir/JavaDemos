/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismdemo;

/**
 *
 * @author Dell e7270
 */
public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger baseLogger) {
        this.logger = baseLogger;
    }

    public void add() {

        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");
                
    }
}
