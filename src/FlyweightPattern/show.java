package FlyweightPattern;
/**
 * ��Ԫģʽ�����ù�������Ч��֧�ִ���ϸ���ȵĶ���
 * ��Ԫģʽ���Ա������������Ŀ������ڳ�������У���ʱ����Ҫ���ɴ���ϸ���ȵ���ʵ������ʾ���ݡ�����ܷ�����Щʵ�����˼���������
 * �����϶�����ͬ�ģ���ʱ�����ܵ�����ȵؼ�����Ҫʵ�������������������ܱ���Щ����һ�����ʵ�����⣬���棬�ڷ�������ʱ�����Ǵ��ݹ������Ϳ���ͨ���������ȵؼ��ٵ���ʵ��������
 * ʹ�������
 *  ���һ��ʹ���˴����Ķ��󣬶���������Щ��������˺ܴ�Ĵ��濪��ʱ��Ӧ�ÿ���ʹ�ã����о��Ƕ���Ĵ����״̬�����ⲿ״̬�����ɾ��������ⲿ״̬����ô��������Խ��ٵĹ������ȡ���ܶ�����󣬴�ʱ���Կ���ʹ����Ԫģʽ
 * @author markla
 *
 */

public class show {
   public static void main(String[] args){
	   WebsiteFactory f=new WebsiteFactory();
	   WebSite fx=f.getWebsite("show product");
	   fx.Use();
	   WebSite fy=f.getWebsite("show product");
	   fy.Use();
	   WebSite fz=f.getWebsite("show product");
	   fz.Use();
	   WebSite f1=f.getWebsite("blog");
	   f1.Use();
	   WebSite f2=f.getWebsite("blog");
	   f2.Use();
	   WebSite f3=f.getWebsite("blog");
	   f3.Use();
	   System.out.println("the count of total website "+f.GetWebSiteCount());
	   
   }
}
