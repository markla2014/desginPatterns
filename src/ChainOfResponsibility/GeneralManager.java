package ChainOfResponsibility;

public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void RequestAppications(Request request) {
		// TODO Auto-generated method stub
   if(request.getReuqestType()=="leave"){
	   System.out.println(name+":"+request.getRequestContent()+" number "+request.getNumber()+" is authoried");
   }else if(request.getReuqestType()=="wage" && request.getNumber()<=500){
	   System.out.println(name+":"+request.getRequestContent()+" number "+request.getNumber()+" is authoried");

   }else if(request.getReuqestType()=="wage" && request.getNumber()>500){
	   System.out.println(name+":"+request.getRequestContent()+" number "+request.getNumber()+" by the ways");
   }
	}

}
