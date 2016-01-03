package CompsitePattern;

public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ConcreteCompany root=new ConcreteCompany("北京总公司");
    		root.add(new HRDepartment("总公司人力资源"));
      root.add(new FinanceDepartment("总公司财务"));
      ConcreteCompany comp=new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源"));
        comp.add(new FinanceDepartment("华东分公司财务部"));
        root.add(comp);
        root.Display(1);
    		  
	}

}
