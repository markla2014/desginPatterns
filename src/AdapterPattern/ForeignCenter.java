package AdapterPattern;

public class ForeignCenter {
   private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
   public void attack1(){
	   System.out.println("foreign"+name+"attack");
   }
   public void defense1(){
	   System.out.println("foreign"+name+"defense");
   }
}
