package VisitorPattern;
/**
 *  ������ģʽ�� ��ʾһ��������ĳ������ṹ�еĸ�Ԫ�صĲ�������ʹ������ڲ��ı�Ԫ�����ǰ���¶�����������ЩԪ�ص��²���
 *  ������ģʽ���������ݽṹ����ȶ���ϵͳ�������ݽṹ�����������ݽṹ�ϵĴ���֮�����Ͻ�������ʹ�ò������Ͽ���������ɵ��̻�
 *  Ŀ�ģ� �ǰѴ�������ݽṹ��������������ڱ仯���㷨�Ļ���ʹ������ģʽ�ͱȽϺ��ʣ���Ϊ������ģʽʹ���㷨���������ӱ�ø�����
 *  ÿ����һ���µĲ���������ζ������һ���µķ����ߡ�������ģʽ���йص���Ϊ���е�һ�����ʶ�����
 * @author markla
 *
 */
public class show {
	
  public static void main(String[] args){
	  ObjectStructure o=new ObjectStructure();
	  o.Attach(new Man());
	  o.Attach(new Woman());
	  Success v1=new Success();
	  o.Display(v1);
	  Failing v2=new Failing();
	  o.Display(v2);
  }
}
