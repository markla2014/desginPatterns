package VisitorPattern;

public class Failing extends Action{

	@Override
	public void GetManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementA.getClass().getTypeName()+" "+this.getClass().getTypeName()+"  may have a greate woman");
	}

	@Override
	public void GetWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println(concreteElementB.getClass().getTypeName()+" "+this.getClass().getSimpleName()+" may have a unluck man");
	}

}
