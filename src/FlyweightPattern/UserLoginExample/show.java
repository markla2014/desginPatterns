package FlyweightPattern.UserLoginExample;

public class show {
  public static void main(String[] args){
	  WebSiteFactory f=new WebSiteFactory();
	  WebSite fx=f.getWebsite("product shower");
	  fx.Use(new User("mark"));
	  WebSite fy=f.getWebsite("product shower");
	  fy.Use(new User("mark1"));
	  WebSite fz=f.getWebsite("product shower");
	  fz.Use(new User("mark2"));
	  WebSite f1=f.getWebsite("blog");
	  f1.Use(new User("louie"));
	  WebSite f2=f.getWebsite("blog");
	  f2.Use(new User("louie1"));
	  WebSite f3=f.getWebsite("blog");
	  f3.Use(new User("louie2"));
	  
	  System.out.println("the count of the webiste: "+f.GetWebSiteCount());
  }
}
