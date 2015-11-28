package FactoryPattern;
/*
 *  工厂类中包含必要的逻辑，根据客户端的选择条件动态实例化相关的类
 */
public class SimplyFectoryImplement {
 public static void main(String args[]){
	 Factory operFactory=new AddFectory();
	 Operation oper=operFactory.CreateOperation();
	 oper.setNumberA("1");
	 oper.setNumberB("2");
	 System.out.println(oper.getRsult());
 }
}
