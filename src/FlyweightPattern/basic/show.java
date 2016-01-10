package FlyweightPattern.basic;

public class show {

	public static void main(String[] args){
		int extrinsicstate=22;
		FlywightFactory f=new FlywightFactory();
		Flyweight fx=f.GetFlyweight("X");
		fx.Operation(--extrinsicstate);
		Flyweight fy=f.GetFlyweight("Y");
		fy.Operation(--extrinsicstate);
		Flyweight fz=f.GetFlyweight("Z");
		fz.Operation(--extrinsicstate);
		UnsharedConcreteFlyweight uf=new UnsharedConcreteFlyweight();
		uf.Operation(--extrinsicstate);
		
	}
}
