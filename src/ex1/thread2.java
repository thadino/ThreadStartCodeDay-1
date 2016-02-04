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
public class thread2 extends Thread {
    
    private boolean keeprunning = true;
    
        int number = 0;
    
        public void run()
    {
        
               while(keeprunning)
                   
        {
            ++number;
            if(number >= 5)
            {
                keeprunning = false;
                
            }
            System.out.println(number);
                   try {
                       Thread.sleep(2000);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(thread2.class.getName()).log(Level.SEVERE, null, ex);
                   }
            
            
        
        }

    }
        
    }
        
