package FlyweightPattern.UserLoginExample;

public class ConcreteWebSite extends WebSite{
 private String name="";
 
	public ConcreteWebSite(String name) {
	super();
	this.name=name;
	// TODO Auto-generated constructor stub
}

	@Override
	public void Use(User user) {
		// TODO Auto-generated method stub
		System.out.println("website category " + name+" user "+ user.getName());
	}
 
}
