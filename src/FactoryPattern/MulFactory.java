package FactoryPattern;

public class MulFactory implements Factory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new multiplpy();
	}

}
