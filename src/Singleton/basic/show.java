package Singleton.basic;
/**
 *  ����ģʽ����֤һ�������һ��ʵ�����ṩһ����������ȫ�ַ��ʵ�
 *  ͨ�����ǿ�����һ��ȫ�ֱ�����һ�����󱻷��ʣ��������ܷ�ֹ��ʵ���������һ����õİ취���ǣ����������𱣴�����Ψһʵ�����������Ա�֤û������ʵ�����Ա������������������ṩһ�����ʸ�ʵ���ķ���
 *  ����ģʽ��Ϊsingleton ���װ����Ψһʵ���������������ϸ�ؿ��ƿͻ����������Լ���ʱ���������򵥵�˵���Ƕ�Ψһʵ�����ܿط���
 *  ���־�̬��ʼ�������Լ������ص�ʱ��ͽ��Լ�ʵ��������Ϊ����ģʽ����Ҫ�ڵ�һ�α�����ʱ���Ž��Լ���ʼ������Ϊ����ģʽ
 * @author markla
 *
 */
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Singleton s1=Singleton.GetInstance();
  Singleton s2=Singleton.GetInstance();
  if(s1==s2){
	  System.out.println("same instance");
  }
	}

}
