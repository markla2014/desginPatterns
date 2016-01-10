package VisitorPattern;

public class Man extends Person {

	@Override
	public void Accept(Action visitor) {
		// TODO Auto-generated method stub
		visitor.GetManConclusion(this);
	}

}
