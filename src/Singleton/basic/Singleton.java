package Singleton.basic;
/**
 *  ����һ��GetInstance ����������ͻ���������Ψһʵ����GetInstance ��һ����̬������Ҫ���𴴽��Լ���Ψһʵ��
 * @author markla
 *
 */
public class Singleton {
private static Singleton instance;
private Singleton(){}
public static Singleton GetInstance(){
  return instance=(instance==null)?new Singleton():instance;
}
}
