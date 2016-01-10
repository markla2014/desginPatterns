package ObserverPattern;
/**
 * 观察者模式定义了一个一对多的依赖关系，让多个观察者同时监听某一个主题对象。这个主题对象在状态发生变化时，会同时通知所有观察者对象，使它们能够更新自己
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
