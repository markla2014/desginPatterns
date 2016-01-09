package MediatorPattern;
/**
 * 尽管将一个系统分割成许多对象通常可以增加其可复用性，但是对象间相互连接的激增可能会减低其可复用性
 * 大量的连接使一个对象不可能在没有其他对象的支持下工作，系统表现为一个不可分割的整体，所以，对系统的行为进行任何较大的改动十分困难
 * 终中介者模式：
 * 用一个中介对象来封装一些系列交互。中介者使各个对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 * @author markla
 *
 */
public class show {

	public static void main(String[] args){
		 Concile UNSC=new Concile();
		 USA c1=new USA(UNSC);
		 Iraq c2=new Iraq(UNSC);
		 UNSC.setColleague1(c1);
		 UNSC.setColleague2(c2);
		 c1.Declare("nnot use the thing ");
		c2.Declare("ok use that");
	}
}
