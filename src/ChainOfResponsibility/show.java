package ChainOfResponsibility;
/**
 *  使用多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
 * @author markla
 * 接受者和发送者都没有对方的明确信息，而且链中的对象自己也并不知道链的结构结果是责任链可简化对象的相互连接，它们仅仅需要指向后继者的引用
 */
public class show {

	public show() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		CommanManager jinli=new CommanManager("mark");
		GeneralManager zhongceng=new GeneralManager("louie");
		Majordomo end=new Majordomo("nick");
		jinli.setSuperior(end);
		end.setSuperior(zhongceng);
		Request req=new Request();
		req.setReuqestType("leave");
		req.setRequestContent("jesica is leaving");
		req.setNumber(1);
		jinli.RequestAppications(req);
	}

}
