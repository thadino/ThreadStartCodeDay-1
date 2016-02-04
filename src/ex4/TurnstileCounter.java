package ex4;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class TurnstileCounter {

  static final long DELAY_VAL = 10000;
  long count = 0;
  AtomicInteger s = new AtomicInteger();
  
  ReentrantLock lock = new ReentrantLock();

  public long getValue() {
    count = s.get(); // sets long count equal to the value of atomic integer s.....
    return count;
  }

  public synchronized void incr() {
    lock.lock();
      try {
s.addAndGet(1);
count++;
      } finally {
          lock.unlock();
      }
  }
}
