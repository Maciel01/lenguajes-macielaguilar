
package concurrencia;

import java.util.logging.Level;
import java.util.logging.Logger;


public class primerThread extends Thread{
    public void  run(){
        try {
            //tercer paso
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(primerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("soy el primer threadsito");
    
    
    
    }   
}
