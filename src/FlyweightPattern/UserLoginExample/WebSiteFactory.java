package FlyweightPattern.UserLoginExample;

import java.util.Hashtable;

public class WebSiteFactory {

	private Hashtable FlyWeights=new Hashtable();
	public WebSite getWebsite(String key){
		if(!FlyWeights.contains(key)){
			FlyWeights.put(key, new ConcreteWebSite(key));
		}
		return ((WebSite)FlyWeights.get(key));
	}
	public int GetWebSiteCount(){
		return FlyWeights.size();
	}
}
