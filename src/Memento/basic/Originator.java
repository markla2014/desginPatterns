package Memento.basic;

public class Originator {
  private String state;
	public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
	public Originator() {
		// TODO Auto-generated constructor stub
		
	}
	public Memento CreateMemento(){
		return new Memento(state);
	}
	
  public void setMemento(Memento menento){
	  state=menento.getState();
  }
  public void Show(){
	  
	  System.out.println("State="+state);
  }
  
}
