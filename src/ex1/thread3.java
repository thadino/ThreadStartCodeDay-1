/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dino
 */
public class thread3 extends Thread {
    
    private boolean keeprunning = true;
    
     int number = 9;
    
    public void run()
    {
        
                       while(keeprunning)
                   
        {
            ++number;
            System.out.println(number);
                   try {
                       Thread.sleep(3000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(thread2.class.getName()).log(Level.SEVERE, null, ex);
                   }
            
            
        
        }
        
    }
    
    public void stoprun()
    {
     keeprunning = false;   
    }
    
    
}
