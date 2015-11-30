package BuliderPattern;

public class Bulider1 extends Bulider {

	private Porduct product=new Porduct();
	@Override
	public void BulidPartA() {
		// TODO Auto-generated method stub
	  product.add("part A");

	}

	@Override
	public void BulidPartB() {
		// TODO Auto-generated method stub
		product.add("part B");
	}

	@Override
	public Porduct GetResult() {
		// TODO Auto-generated method stub
		return product;
	}

	

}
