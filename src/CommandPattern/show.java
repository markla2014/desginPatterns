package CommandPattern;
/**
 * ��һ�������װ��Ϊһ�����󣬴Ӷ�ʹ����ò�ͬ������Կͻ����в������������Ŷӻ���������־���Լ�֧�ֿɳ����Ĳ���
 * @author markla
 *  ֻ�����������ͻָ������ȹ��ܵ�ʱ��ʹ��
 *  1����������
 * 2 ��¼���������־
 * 3 �ж�������
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
