package ChainOfResponsibility;
/**
 *  ʹ�ö�������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮�����Ͻ������������һ���������������������ݸ�����ֱ����һ����������Ϊֹ
 * @author markla
 * �����ߺͷ����߶�û�жԷ�����ȷ��Ϣ���������еĶ����Լ�Ҳ����֪�����Ľṹ������������ɼ򻯶�����໥���ӣ����ǽ�����Ҫָ�����ߵ�����
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
