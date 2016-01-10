package VisitorPattern.basic;

public class ConcreteElementB extends Element{

	@Override
	public void Accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.VisitConcreteElementsB(this);
	}
 
}
