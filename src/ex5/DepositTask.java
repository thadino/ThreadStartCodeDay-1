/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author jekm
 */
public class DepositTask implements Runnable
{
  BankAccountUnsynchronized acc;
  public DepositTask(BankAccountUnsynchronized a)
  {
    acc = a;
  }
  @Override
  public synchronized void run()
  {
    try
    {
      for (int i = 1 ; i< 30 ;i++ ) 
      {
        acc.deposit(100);
        Thread.sleep(1);
      }
    }
    catch (InterruptedException e) {}
  }
}

