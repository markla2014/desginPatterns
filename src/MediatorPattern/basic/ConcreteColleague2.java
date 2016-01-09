package MediatorPattern.basic;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
 public void Send(String message){
	 mediator.Send(message, this);
 }
 public void Notify(String message){
	 System.out.println("同事2得到消息： "+message);
 }
}