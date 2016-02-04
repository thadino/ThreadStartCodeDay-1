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
public class MyThread extends Thread {
    
    Even e = new Even();
    
    int rounds = 0;
    
        public void run()
    {
        while(rounds < 200)
        {
           rounds++;
                System.out.println(e.next());
            }
        }

    }
