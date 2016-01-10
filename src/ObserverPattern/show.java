package ObserverPattern;
/**
 * 观察者模式定义了一个一对多的依赖关系，让多个观察者同时监听某一个主题对象。这个主题对象在状态发生变化时，会同时通知所有观察者对象，使它们能够更新自己
 * 
 * 将一个系统分割成一系列相互协作的类有一个很不好的副作用，那就是需要维护相关对象的一致性。我们不希望为了一致性而导致各类精密耦合，这样会给维护，扩展和重用带来不方便
 * 作用：
 * 当一个对象改变需要同时改变其他对象而且它不知道具体有多少对象有待改变时，应该考虑使用观察者模式
 * 其中一个方面依赖于另一个方面，这时用观察者模式可以将这两者封装在独立的对象中使它们独自独立地改变和重用
 * 观察者所做的工作其实就是在解除耦合。让耦合的双方都依赖于抽象而不是依赖于具体。从而使得各自的变化都不会影响另一边的变化
 * @author markla
 *
 */
public class show {
  public static void main(String[] args){
	  Boss boss=new Boss();
	  StockObserver t1=new StockObserver("mark",boss);
	  NBAObserver t2=new NBAObserver("jack",boss);
	  boss.Attach(t1);
	  boss.Attach(t2);
	  boss.setAction("hello, everyone");
	  boss.Notify();
  }
}
