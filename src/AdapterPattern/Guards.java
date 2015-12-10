package AdapterPattern;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("Guards"+name+"attack");
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("Guards"+name+"defense");
	}

}
