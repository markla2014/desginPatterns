package Singleton;
/**
 * multithread singlton 
 *  lock 是确保一个线程位于代码的临界区时候，另一个线程不进入临界区。如果其他线程试图进入锁定的代码，则它将一直等待直到该对象被释放
 * @author markla
 *
 */
public class Singleton {
  private static Singleton instance;
  private static Object syncRoot=new Object();
  private Singleton(){
	  
  }
  public static Singleton GetIntance(){
	  synchronized (syncRoot){
		  instance=(instance==null)?new Singleton():instance;
	  }
	  return instance;
  }
}
