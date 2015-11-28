package FactoryPattern;
/*
 * 工厂方法：定义了一个用户创建对象的借口，让子类决定实例化哪一个类
 */
public interface Factory {

   Operation CreateOperation();
}
