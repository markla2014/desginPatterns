package FlyweightPattern;
/**
 * 享元模式：运用共享技术有效地支持大量细粒度的对象
 * 享元模式可以避免大量类似类的开销。在程序设计中，有时候需要生成大量细粒度的类实例来表示数据。如果能发现这些实例除了几个参数外
 * 基本上都是相同的，有时就能受到大幅度地减少需要实例化的类的数量。如果能报那些参数一道类的实例的外，外面，在方法调用时将它们传递过来，就可以通过共享大幅度地减少单个实例的数量
 * 使用情况：
 *  如果一个使用了大量的对象，而大量的这些对象造成了很大的储存开销时就应该考虑使用；还有就是对象的大多数状态可以外部状态，如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象，此时可以考虑使用享元模式
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
