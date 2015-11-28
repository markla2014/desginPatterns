package FactoryPattern;

public class AddFectory implements Factory {

	@Override
	public Operation CreateOperation() {
		// TODO Auto-generated method stub
		return new Add();
	}

}
