package MediatorPattern;

public class USA extends Country {

	public USA(UniteNations mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
   public void Declare(String message){
	   mediator.Declare(message,this);
   }
   public void getMessage(String message){
	   System.out.println("Usa get message: "+message);
   }
}
