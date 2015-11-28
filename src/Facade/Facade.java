package Facade;
/*
 * 将不同的层进行分离
 * 为设计粗糙或者复杂的逻辑提供比较清晰的接口
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
			System.out.println("子系统方法一 ");
		}
	}
	class subSystemTwo{
		public void methodTwo(){
			System.out.println("子系统方法二");
		}
	}
	class subSystemThree{
		public void methodTwo(){
			System.out.println("子系统方法z ");
		}
	}
	class subSystemFoure{
		public void methodTwo(){
			System.out.println("子系统方法k ");
		}
	}
public static void main(String args[]){
	Facade a=new Facade();
	a.methodeA();
}
}
