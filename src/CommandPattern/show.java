package CommandPattern;
/**
 * 将一个请求封装成为一个对象，从而使你可用不同的请求对客户进行参数化，请求排队或者请求日志，以及支持可撤销的操作
 * @author markla
 *  只有真正撤销和恢复操作等功能的时候使用
 *  1设计命令队列
 * 2 记录命令进入日志
 * 3 判断请求否决
 */
public class show {

	public static void main(String[] args){
		Barbecuuer boy=new Barbecuuer();
		Command bakeMuttonCommand1=new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2=new BakeMuttonCommand(boy);
		Command bakeChckenWingCommand1=new BakeChickenWingCommand(boy);
		Waiter girl=new Waiter();
	    girl.SetOrder(bakeMuttonCommand1);
	    girl.SetOrder(bakeMuttonCommand2);
	    girl.SetOrder(bakeChckenWingCommand1);
	    girl.Notify();
	    
	}
}
