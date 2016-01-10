package Singleton;
/**
 *  为了防止线程被重用的情况
 *  当线程一进来创建了实例但是线程二还有可能创建实例
 * @author markla
 *
 */
public class DoubleCheckSingleton {
	 private static DoubleCheckSingleton instance;
	  private static Object syncRoot=new Object();
	  private DoubleCheckSingleton(){
		  
	  }
	  public static DoubleCheckSingleton GetIntance(){
		  if(instance==null){
		  synchronized (syncRoot){
			  instance=(instance==null)?new DoubleCheckSingleton():instance;
		  }
		  }
		  return instance;
	  }
}
