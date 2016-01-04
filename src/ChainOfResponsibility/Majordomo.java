package ChainOfResponsibility;

public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestAppications(Request request) {
		// TODO Auto-generated method stub
		if(request.getReuqestType()=="leave" && request.getNumber()<=5){
			   System.out.println(name +":"+request.getRequestContent()+" times "+request.getNumber()+" is authored");
		   }else{
			   if(superior !=null){
				   superior.RequestAppications(request);
			   }
		   }

	}

}
