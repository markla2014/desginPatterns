package ObserverPattern;
/**
 * �۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲���ͬʱ����ĳһ���������������������״̬�����仯ʱ����ͬʱ֪ͨ���й۲��߶���ʹ�����ܹ������Լ�
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
