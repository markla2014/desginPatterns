package BuliderPattern;

public class Builder2 extends Bulider {

	private Porduct product=new Porduct();
	@Override
	public void BulidPartA() {
		// TODO Auto-generated method stub
	  product.add("part x");

	}

	@Override
	public void BulidPartB() {
		// TODO Auto-generated method stub
		product.add("part y");
	}

	@Override
	public Porduct GetResult() {
		// TODO Auto-generated method stub
		return product;
	}
}
