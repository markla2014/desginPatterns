package PrototypePattern;
/*
 * 深复制把引用的对象的变量指向复制过来的新对象，而不是引用的对象
 */
public class DeepResume {
	public String name;
	 public String sex;
	 public String age;
	  public WorkExperience work;
	 
	 public DeepResume(String name){
		 this.name=name;
		 work=new WorkExperience();
	 }
	 public DeepResume(WorkExperience work){
		 try {
			this.work=(WorkExperience)work.Clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 public void SetPersonalInfomation(String sex, String age){
		 this.sex=sex;
		 this.age=age;
	 }
	 public void SetWorkExperience(String timeArea,String company){
		 work.setCompany(company);
		 work.setWorkDate(timeArea);
	 }
	 public void Display(){
		 System.out.println(name+" "+sex+" "+age);
		 System.out.println("工作经历："+work.getWorkDate()+" "+work.getCompany());
	 }
	 public Object Clone(){
		 DeepResume obj=new DeepResume(this.work);
		obj.name=this.name;
		obj.sex=this.sex;
		obj.age=this.age;
		return obj;
	 }
	 public static void main(String args[]){
		 DeepResume a=new DeepResume("mark");
		 a.SetPersonalInfomation("male","29");
		 a.SetWorkExperience("1999-2000","xxx");
		
		  DeepResume b=(DeepResume)a.Clone();
		 b.SetWorkExperience("2001-2015", "y");
		 DeepResume c=(DeepResume)a.Clone();
		 c.SetWorkExperience("1998-2003","zzz");
		 a.Display();
		 b.Display();
		 c.Display();
	 }
	}

