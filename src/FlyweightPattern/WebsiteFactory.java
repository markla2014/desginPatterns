package FlyweightPattern;

import java.util.Hashtable;

public class WebsiteFactory {
  private Hashtable flyweights=new Hashtable();
  
	public WebSite getWebsite(String key) {

		if(!flyweights.contains(key)){
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return ((WebSite)flyweights.get(key));
		// TODO Auto-generated constructor stub
	}

 public int GetWebSiteCount(){
	 return flyweights.size();
 }
}
