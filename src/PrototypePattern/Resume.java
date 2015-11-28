package PrototypePattern;
/*
 *  一般初始化的信息不发生变化的情况下克隆是最好办法
 *  浅复制 被复制对象都含有与原来对象相同的值，而所有对其他对象的引用仍然指向原来的对象
 */
public class Resume implements Cloneable{
 public String name;
 public String sex;
 public String age;
 private String timeArea;
 private String company;
 
 public Resume(String name){
	 this.name=name;
 }
 public void SetPersonalInfomation(String sex, String age){
	 this.sex=sex;
	 this.age=age;
 }
 public void SetWorkExperience(String timeArea,String company){
	 this.timeArea=timeArea;
	 this.company=company;
 }
 public void Display(){
	 System.out.println(name+" "+sex+" "+age);
	 System.out.println("工作经历："+timeArea+" "+company);
 }
 public Object Clone() throws CloneNotSupportedException{
	 return (Object) super.clone();
 }
 public static void main(String args[]){
	 Resume a=new Resume("mark");
	 a.SetPersonalInfomation("male","29");
	 a.SetWorkExperience("1999-2000","xxx");
	 Resume b=null;
	 try {
		b=(Resume)a.Clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 b.SetWorkExperience("2001-2015", "y");
	 Resume c=null;
	 try {
		c=(Resume)a.Clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	c.SetPersonalInfomation("Famle","24");
	 a.Display();
	 b.Display();
	 c.Display();
 }
}
