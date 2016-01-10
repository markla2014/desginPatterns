package ObserverPattern;

public class StockObserver extends Observer {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println(sub.getAction()+" "+name+" close stock  and continus to working");
	}

}
