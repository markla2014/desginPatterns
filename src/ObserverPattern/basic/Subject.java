package ObserverPattern.basic;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {

 private List<Observer> observers=new LinkedList<Observer>();
 public void Attach(Observer observer){
	 observers.add(observer);
 }
 public void Detach(Observer observer){
	 observers.remove(observer);
 }
 public void Notify(){
	 observers.forEach(e->e.Update());
 }
}
