package ChainOfResponsibility.basic;


/*
 *  �����Լ���ͬһ������������ã����������Ͻ��д���
 */
public class MyHandler extends AbstractHandler implements Handler {
  private String name;
  public MyHandler(String name) {
	// TODO Auto-generated constructor stub
	  this.name=name;
}
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println(name+" deal!");
		if(getHandler()!=null){
			getHandler().operation();
		}
	}
   public static void main(String args[]){
	   MyHandler h1=new MyHandler("h1");
	   MyHandler h2=new MyHandler("h2");
	   MyHandler h3=new MyHandler("h3");
         h1.setHandler(h2);
         h2.setHandler(h3);
         h1.operation();
   }
}