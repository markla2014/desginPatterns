package FactoryPattern;
/*
 *  �������а�����Ҫ���߼������ݿͻ��˵�ѡ��������̬ʵ������ص���
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
