package CompsitePattern;

public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ConcreteCompany root=new ConcreteCompany("�����ܹ�˾");
    		root.add(new HRDepartment("�ܹ�˾������Դ"));
      root.add(new FinanceDepartment("�ܹ�˾����"));
      ConcreteCompany comp=new ConcreteCompany("�Ϻ������ֹ�˾");
        comp.add(new HRDepartment("�����ֹ�˾������Դ"));
        comp.add(new FinanceDepartment("�����ֹ�˾����"));
        root.add(comp);
        root.Display(1);
    		  
	}

}
