package MediatorPattern.basic;

public class ConreteMediator extends Mediator {
	


	public ConcreteColleague1 getConcreteColleague1() {
		return ConcreteColleague1;
	}


	public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
		ConcreteColleague1 = concreteColleague1;
	}


	public ConcreteColleague2 getConcreteColleague2() {
		return ConcreteColleague2;
	}


	public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
		ConcreteColleague2 = concreteColleague2;
	}


	private ConcreteColleague1 ConcreteColleague1;
	private ConcreteColleague2 ConcreteColleague2;

	public void Send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
  if(ConcreteColleague1.getClass().isInstance(colleague)){
	  ConcreteColleague2.Notify(message);
  }else{
	  ConcreteColleague1.Notify(message);
  }
	}

}
