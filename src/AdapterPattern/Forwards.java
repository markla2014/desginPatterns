package AdapterPattern;

public class Forwards extends Player {

	public Forwards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("forwarder"+name+"attack");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("forwarder"+name+"defense");
	}
   
}
