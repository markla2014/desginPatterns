package Singleton.basic;
/**
 *  单例模式：保证一个类仅有一个实例并提供一个访问它的全局访问点
 *  通常我们可以让一个全局变量是一个对象被访问，但它不能防止你实例多个对象。一个最好的办法就是，让类自身负责保存它的唯一实例。这个类可以保证没有其他实例可以被创建，并且它可以提供一个访问该实例的方法
 *  单例模式因为singleton 类封装它的唯一实例，这样它可以严格地控制客户怎样访问以及何时访问它。简单地说就是对唯一实例的受控访问
 *  这种静态初始化是在自己被加载的时候就将自己实例化被称为饿汉模式，需要在第一次被引用时，才将自己初始化被称为懒汉模式
 * @author markla
 *
 */
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Singleton s1=Singleton.GetInstance();
  Singleton s2=Singleton.GetInstance();
  if(s1==s2){
	  System.out.println("same instance");
  }
	}

}
