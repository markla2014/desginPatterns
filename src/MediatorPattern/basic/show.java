package MediatorPattern.basic;

public class show {
 public static void main(String[] args){
	 ConreteMediator m=new ConreteMediator();
	 ConcreteColleague1 c1=new ConcreteColleague1(m);
	 ConcreteColleague2 c2=new ConcreteColleague2(m);
	 m.setConcreteColleague1(c1);
	 m.setConcreteColleague2(c2);
	 c1.Send("hello, mark");
	 c2.Send("good morning");
	 
 }
}
