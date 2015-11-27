package Decorator;
/*
 * author: mark 
 * asuuming: for this design pattern can be use for the some recursive work component/workflowe 
 *  it can be used on the some tools class or motidfy the class 
 *
 */

public class DecroterImplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person xc=new StylePerson("mark");
      Sneakers a=new Sneakers();
      BigTrouser b=new BigTrouser();
      TShirtes c=new TShirtes();
      a.Decorate(xc);
      b.Decorate(a);
      c.Decorate(b);
      c.show();
	}

}
