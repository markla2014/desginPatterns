package Memento.basic;
/**
 *  ����¼ģʽ�� �ڲ��ƻ���װ�Ե�ǰ���£���׽һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬�������Ժ�Ϳ��Խ��ö���ָ���ԭ�ȱ����״̬
 *  ������
 *  ���ܱȽϸ��ӣ�����Ҫά�����߼�¼������ʷ��ļ�¼���������Ҫ���������ֻ���ڶ����Ե�һС����
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
