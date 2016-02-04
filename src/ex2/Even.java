/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dino
 */
public class Even {
    
    private int n;
    private int c;
    
    public synchronized int next()
    {
        int result = c;
        result++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Even.class.getName()).log(Level.SEVERE, null, ex);
        }
        result++;
        c = result;
      //  n++;
      //  n++;
        return c;
    }
    
    public int getc()
    {
    return c;
    }
    
}
