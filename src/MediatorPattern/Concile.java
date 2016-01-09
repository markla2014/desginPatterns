package MediatorPattern;

public class Concile extends UniteNations {
  public USA getColleague1() {
		return colleague1;
	}
	public void setColleague1(USA colleague1) {
		this.colleague1 = colleague1;
	}
	public Iraq getColleague2() {
		return colleague2;
	}
	public void setColleague2(Iraq colleague2) {
		this.colleague2 = colleague2;
	}
private USA colleague1;
  private Iraq colleague2; 
	@Override
	public void Declare(String message, Country colleague) {
		// TODO Auto-generated method stub
 if(colleague==colleague1){
	 colleague2.GetMessage(message);
 }else{
	 colleague1.getMessage(message);
 }
	}

}
