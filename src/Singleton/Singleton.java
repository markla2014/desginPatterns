package Singleton;
/**
 * multithread singlton 
 *  lock ��ȷ��һ���߳�λ�ڴ�����ٽ���ʱ����һ���̲߳������ٽ�������������߳���ͼ���������Ĵ��룬������һֱ�ȴ�ֱ���ö����ͷ�
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
