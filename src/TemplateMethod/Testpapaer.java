package TemplateMethod;
/*
 * �ڸ����ж�����������߼���ʵ��
 * �����ڲ�ͬ�����൱��ʵ��
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
