package Facade;
/*
 * ����ͬ�Ĳ���з���
 * Ϊ��ƴֲڻ��߸��ӵ��߼��ṩ�Ƚ������Ľӿ�
 */
public class Facade {
	SubSystemOne one;
	subSystemTwo two;
	subSystemThree three;
	subSystemFoure forue;
	public Facade(){
		one=new SubSystemOne();
		two=new subSystemTwo();
		three=new subSystemThree();
		forue=new subSystemFoure();
	}
	public void methodeA(){
		one.methodOne();
		three.methodTwo();
	}
	class SubSystemOne{
		public void methodOne(){
			System.out.println("��ϵͳ����һ ");
		}
	}
	class subSystemTwo{
		public void methodTwo(){
			System.out.println("��ϵͳ������");
		}
	}
	class subSystemThree{
		public void methodTwo(){
			System.out.println("��ϵͳ����z ");
		}
	}
	class subSystemFoure{
		public void methodTwo(){
			System.out.println("��ϵͳ����k ");
		}
	}
public static void main(String args[]){
	Facade a=new Facade();
	a.methodeA();
}
}
