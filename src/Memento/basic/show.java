package Memento.basic;
/**
 *  备忘录模式： 在不破坏封装性的前提下，捕捉一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可以将该对象恢复到原先保存的状态
 *  场景：
 *  功能比较复杂，但需要维护或者记录属性历史类的记录的类或者需要保存的属性只是众多属性的一小部分
 * @author markla
 *
 */
public class show {

	public static void main(String[] args){
		Originator o=new Originator();
		o.setState("On");
		o.Show();
		Caretaker c=new Caretaker();
		c.setMemento(o.CreateMemento());
		o.setState("off");
		o.Show();
		o.setMemento(c.getMemento());
		o.Show();
	}
}
