package VisitorPattern.basic;

public class ConcreteVisitor1 extends Visitor {

	@Override
	public void VisitConcreteElementsA(ConcreteElementA concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getClass().getTypeName()+" is visited by"+ this.getClass().getTypeName());
	}

	@Override
	public void VisitConcreteElementsB(ConcreteElementB concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.getClass().getTypeName()+" is visited by"+this.getClass().getTypeName());
	}
  
}
