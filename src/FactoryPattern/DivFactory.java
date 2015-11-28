package FactoryPattern;

public class DivFactory implements Factory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new Divid();
	}

}
