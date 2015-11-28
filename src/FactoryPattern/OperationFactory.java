package FactoryPattern;
/*just a simple parrten make a simple mind
 * use a simple class to contorl all the operation 
 * change the thing
 */
public class OperationFactory {
    private Operation operate1;
    
	public Operation getOperate1() {
		return operate1;
	}
	public void setOperate1(Operation operate1) {
		this.operate1 = operate1;
	}
	public OperationFactory(char operate) {
	;
		switch (operate) {
		case '+':
			operate1=new Add();
			break;
		case '-':
			operate1=new reduce();
			break;
		case '/':
			operate1=new Divid();
			break;
		case '*':
			operate1=new multiplpy();
			break;
		default:
			break;
		}
	}
public static void main(String args[]){
	OperationFactory a=new OperationFactory('-');
	a.getOperate1().setNumberA("2");
	a.getOperate1().setNumberB("1");
	System.out.println(a.getOperate1().getRsult());
	
}
}
