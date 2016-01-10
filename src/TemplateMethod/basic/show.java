package TemplateMethod.basic;

public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AbstractClass c;
    c=new ConcreteClassA();
    c.TemplateMethod();
    c=new ConcreteClassB();
    c.TemplateMethod();
	}

}
