package VisitorPattern.basic;

public class ConcreteElementA extends Element{

	@Override
	public void Accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.VisitConcreteElementsA(this);
	}
 
}
