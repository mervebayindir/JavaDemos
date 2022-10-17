/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphismdemo;

/**
 *
 * @author Dell e7270
 */
public class PolymorphismDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        EmailLogger logger=new EmailLogger();
//        logger.Log("Log mesajı");
//          BaseLogger[] loggers =new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//          for (BaseLogger logger : loggers) {
//            logger.Log("Log mesajı");
//        }
        CustomerManager customerManager=new CustomerManager(new FileLogger());
         customerManager.add();
        
    }
    
}
