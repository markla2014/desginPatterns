package TemplateMethod;

public abstract class TestPaper {
  public void Testquestion1(){
	  System.out.println("your name: ");
	  System.out.println(getAnswer1());
  }
   public void Testquestion2(){
	   System.out.println("brithday:");
	   System.out.println(getAnswer2());
   }
   public void Testquestion3(){
	   System.out.println("your favority food");
	   System.out.println(getAnswer3());
   }
   public abstract String getAnswer1();
   public abstract String getAnswer2();
   public abstract String getAnswer3();
   
}
