package MediatorPattern;
/**
 * ���ܽ�һ��ϵͳ�ָ��������ͨ������������ɸ����ԣ����Ƕ�����໥���ӵļ������ܻ������ɸ�����
 * ����������ʹһ�����󲻿�����û�����������֧���¹�����ϵͳ����Ϊһ�����ɷָ�����壬���ԣ���ϵͳ����Ϊ�����κνϴ�ĸĶ�ʮ������
 * ���н���ģʽ��
 * ��һ���н��������װһЩϵ�н������н���ʹ����������Ҫ��ʽ���໥���ã��Ӷ�ʹ�������ɢ�����ҿ��Զ����ظı�����֮��Ľ���
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
