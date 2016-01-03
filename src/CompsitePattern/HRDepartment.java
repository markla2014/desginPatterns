package CompsitePattern;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Display(Company c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LineOfDuty() {
		// TODO Auto-generated method stub
      System.out.println(name+" 员工招聘管理");		
	}

	@Override
	public void Display(int depth) {
		// TODO Auto-generated method stub
		System.out.println("-"+depth+name);
	}

	
}
