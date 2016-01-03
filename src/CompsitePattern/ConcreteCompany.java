package CompsitePattern;

import java.util.LinkedList;
import java.util.List;


public class ConcreteCompany extends Company {
  public ConcreteCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

private List<Company> children=new LinkedList<Company>();
  


@Override
public void add(Company c) {
	// TODO Auto-generated method stub
	children.add(c);
}

@Override
public void Display(Company c) {
	// TODO Auto-generated method stub
	children.add(c);
}

@Override
public void LineOfDuty() {
	// TODO Auto-generated method stub
	for(Company component : children){
		component.LineOfDuty();
		
	}
}

@Override
public void Display(int depth) {
	// TODO Auto-generated method stub
	System.out.println("-"+depth);
  children.forEach(com->com.Display(depth+2));
 }
}
