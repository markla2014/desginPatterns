package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

public class Secretary implements Subject {
  private List<Observer> observers=new LinkedList<Observer>();
  private String action;
  
  public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public void Attach(Observer observer){
	  observers.add(observer);
  }
  public void Detach(Observer observer){
	  observers.remove(observer);
  }
  public void Notify(){
	  observers.forEach(o->o.Update());
  }
}
