package MediatorPattern;

public class Iraq extends Country {

	public Iraq(UniteNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
public void Declare(String message){
	mediator.Declare(message,this);
}
public void GetMessage(String message){
	System.out.println("Iraq ger message: "+message);
}
}
