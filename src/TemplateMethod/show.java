package TemplateMethod;
/**
 * ģ�巽��ģʽ�� ����һ�������е��㷨�Ǽܣ�����һЩ�����ӳٵ������С�ģ�巽��ʹ��������Բ��ı�һ���㷨�Ľṹ�������¶�����㷨��ĳЩ�ض�����
 * ģ�巽����ͨ���Ѳ�����Ϊ���Ƶ����࣬ȥ�������е��ظ������������������ơ�ģ�巽��ģʽ�����ṩ��һ���ܺõش��븴��ƽ̨��������ĺͿɱ����Ϊ�ڷ���������ʵ���л����һ����Ǻ󣬲������Ϊ�ͻ����������ظ����֡�
 * ģ���̸��ģʽ����Щ��Ϊ���Ƶ���һ�ĵط�����Ͱ�����������ظ��Ĳ�����Ϊ�ľ���
 * ������Ҫ���ĳһ��ϸ�ڲ��һ�µ�һ�����̻�һϵ�в��衣����������ڸ���ϸ�Ĳ���ϵ�ʵ�ֿ��ܲ�ͬʱ������ͨ������ʹ��ģ�巽��ģʽ������
 * @author markla
 *
 */
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("student A");
     TestPaper studentA=new student1();
     studentA.Testquestion1();
     studentA.Testquestion2();
     studentA.Testquestion3();
     System.out.println("student B");
     TestPaper studentB=new student2();
     studentB.Testquestion1();
     studentB.Testquestion2();
     studentB.Testquestion3();
     
     
	}

}
