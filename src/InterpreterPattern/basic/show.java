package InterpreterPattern.basic;

import java.util.LinkedList;
import java.util.List;
/**
 * ����һ��������Ҫ����ִ�У�������ɽ��������еľ��ӱ�ʾ��Ϊһ��������﷨��ʱ����ʹ�ý�����ģʽ
 * 
 * @author markla
 *
 */
public class show {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       thisContext context=new thisContext();
       List<thisExpression> list=new LinkedList<thisExpression>();
       list.add(new TerminalExpression());
       list.add(new NonterminalExpression());
       list.add(new TerminalExpression());
       list.add(new TerminalExpression()); 
       
       list.forEach(exp->exp.Interpret(context));
       
	}

}
