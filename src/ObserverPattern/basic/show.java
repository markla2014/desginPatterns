package ObserverPattern.basic;

public class show {
 public static void main(String[] args){
	 ConcreteSubject s=new ConcreteSubject();
	 s.Attach(new ConcreteObserver(s,"x"));
	 s.Attach(new ConcreteObserver(s,"y"));
	 s.setSubjectState("mark");
	 s.Notify();
 }
}
