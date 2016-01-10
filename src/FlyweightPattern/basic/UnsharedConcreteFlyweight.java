package FlyweightPattern.basic;

public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void Operation(int extrinsicstate) {
		// TODO Auto-generated method stub
  System.out.println("not share the concreteFlyweight"+ extrinsicstate);
	}

}
