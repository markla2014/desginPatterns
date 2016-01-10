package ObserverPattern.basic;

public class ConcreteObserver extends Observer {
private String name;
private String observerState;
private ConcreteSubject subject;
public ConcreteSubject getSubject() {
	return subject;
}
public void setSubject(ConcreteSubject subject) {
	this.subject = subject;
}
public ConcreteObserver(ConcreteSubject subject,String name) {
	// TODO Auto-generated constructor stub
	this.subject=subject;
	this.name=name;
}
@Override
public void Update() {
	// TODO Auto-generated method stub
	observerState=subject.getSubjectState();
	System.out.println("oberver "+name+" have new state "+observerState);
}
}
