/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Dino
 */
public class ex2 {
    
    public static void main(String[] args) throws InterruptedException
    {
          Even e = new Even();
          MyThread mt = new MyThread();
          MyThread2 mt2 = new MyThread2();
          Thread t1 = new Thread(mt);
          Thread t2 = new Thread(mt2);
          t1.start();
          t2.start();
                    System.out.println(Thread.activeCount());
    }
    
}
