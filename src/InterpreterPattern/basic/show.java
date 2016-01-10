package InterpreterPattern.basic;

import java.util.LinkedList;
import java.util.List;
/**
 * 当有一个语言需要解释执行，并且你可将该语言中的句子表示成为一个抽象的语法树时，可使用解释器模式
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
