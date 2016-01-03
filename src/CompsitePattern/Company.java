package CompsitePattern;

public abstract class Company {

	protected String name;
	public Company(String name){
		this.name=name;
	}
   public abstract void add(Company c);
   public abstract void Display(Company c);
   public abstract void LineOfDuty();
   public abstract void Display(int depth);
	
}
