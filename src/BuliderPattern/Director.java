package BuliderPattern;
/*
 * 建造者模式使用在统一规律下的不同构造函数的代码
 * 当创建复杂的对象的算法应该独立于该对象的组成部分以及它们的装配方式时适用的模式
 * 主要是用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但对象的内部的构建通常面临复杂的变化
 */
public class Director {
   public void Construct(Bulider builder){
	     builder.BulidPartA();
	     builder.BulidPartB();
   }
   public static void main(String args[]){
	   Director director=new Director();
	   Bulider b1=new Bulider1();
	   director.Construct(b1);
	   Porduct p1=b1.GetResult();
	   p1.show();
   }
}
