package Singleton;
/**
 *  Ϊ�˷�ֹ�̱߳����õ����
 *  ���߳�һ����������ʵ�������̶߳����п��ܴ���ʵ��
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
