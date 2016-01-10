package Singleton.basic;
/**
 *  定义一个GetInstance 操作，允许客户访问它的唯一实例。GetInstance 是一个静态方法主要负责创建自己的唯一实例
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
