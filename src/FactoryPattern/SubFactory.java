package FactoryPattern;

public class SubFactory implements Factory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new reduce();
	}

}
