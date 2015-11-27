package Decorator;
// be decorated 
public class StylePerson extends Person {
	public String name;
   public StylePerson(String name){this.name=name;};
   @Override
   public void show(){
	   
	   System.out.println("the name is "+name);
   };
}
