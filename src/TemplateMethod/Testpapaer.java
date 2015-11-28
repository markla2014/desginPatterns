package TemplateMethod;
/*
 * 在父类中定义了子类的逻辑和实现
 * 最终在不同的子类当中实现
 * 
 */
public abstract class Testpapaer {
public abstract void operation1();
public abstract void operation2();
public void TemplateMethod(){
	operation1();
	operation2();
	System.out.println("finisnsh");
}
}
