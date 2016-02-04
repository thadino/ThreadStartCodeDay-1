/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author Dino
 */
public class ex1 {
    
    public static void main(String[] args) throws InterruptedException 
    {
          
          thread1 t1 = new thread1();
          thread2 t2 = new thread2();
          thread3 t3 = new thread3();
          t1.start();
          t2.start();
          t3.start();
          System.out.println("Count threads:" + Thread.activeCount());
          Thread.sleep(10000);
          t3.stoprun();
    }
    
}
