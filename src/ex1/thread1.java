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
public class thread1 extends Thread {
    
    private boolean keeprunning = true;
    
    long number = 0;
    long sum = 0;
    
    public void run()
    {
        // 1000000000
        
       while(keeprunning)
        {
            if(number >= 1000000000)
            {
                keeprunning = false;
                System.out.println("Number:" + number  + " SUM:" + sum);
            }
            number++;
            sum = sum + number;
        
        }

    }
    
}

