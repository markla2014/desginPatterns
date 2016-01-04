package ChainOfResponsibility;

public class CommanManager extends Manager {

	public CommanManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestAppications(Request request) {
		// TODO Auto-generated method stub
   if(request.getReuqestType()=="leave" && request.getNumber()<=2){
	   System.out.println(name +":"+request.getRequestContent()+" times "+request.getNumber());
   }else{
	   if(superior !=null){
		   superior.RequestAppications(request);
	   }
   }
	}

}
