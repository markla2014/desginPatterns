package FlyweightPattern;

public class ConcreteWebSite extends WebSite {
  private String name;
  public ConcreteWebSite(String name){
	  super();
	  this.name=name;
  }
@Override
public void Use() {
	// TODO Auto-generated method stub
	System.out.println("Website category"+ name);
}
  
}
