package BuliderPattern;
/*
 * ������ģʽʹ����ͳһ�����µĲ�ͬ���캯���Ĵ���
 * ���������ӵĶ�����㷨Ӧ�ö����ڸö������ɲ����Լ����ǵ�װ�䷽ʽʱ���õ�ģʽ
 * ��Ҫ�����ڴ���һЩ���ӵĶ�����Щ�����ڲ�������Ľ���˳��ͨ�����ȶ��ģ���������ڲ��Ĺ���ͨ�����ٸ��ӵı仯
 */
public class Director {
   public void Construct(Bulider builder){
	     builder.BulidPartA();
	     builder.BulidPartB();
   }
   public static void main(String args[]){
	   Director director=new Director();
	   Bulider b1=new Bulider1();
	   director.Construct(b1);
	   Porduct p1=b1.GetResult();
	   p1.show();
   }
}
