package FlyweightPattern.basic;

import java.util.Hashtable;

public class FlywightFactory {
@SuppressWarnings("rawtypes")
private Hashtable<String,Object> flyweights=new Hashtable<String,Object>();
public FlywightFactory(){
flyweights.put("X",new ConcreteFlyWeight());
flyweights.put("Y",new ConcreteFlyWeight());
flyweights.put("Z",new ConcreteFlyWeight());
}
public Flyweight GetFlyweight(String key){
	return ((Flyweight)flyweights.get(key));
}
}
