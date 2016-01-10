package InterpreterPattern;
/**
 * 解释器模式： 给一个语言，定义它的文法的一种表示并定义一个解释器，这个解释器使用该表示来解释语言中的句子
 * 如果一个特定的类型的问题发生的频率足够高，那么异能就值得将问题的各个实例表述为一个简单的句子。这样就可以构建一个解释器，该解释器通过解释这个句子来解决该问题
 * 很容易改变和扩展文法，因为该模式使用类表示文法规则，你可使用继承改变或扩展该文法。也容易实现文法，因为定义抽象语法树种各个节点的累的实现大体类似，这些类都易于直接编写
 * 不足：
 * 解释器模式为文法中的每一条规则至少定义了一个类，因此包括许多规则的文法可能难以管理和维护。建议当文法非常复杂时，使用其他的技术语言分析程序或解释器生成器来处理
 * @author markla
 *
 */
public class show {
 public static void main(String[] args ){
	 
	 PlayContext context=new PlayContext();
	 System.out.println("上海滩： ");
	 context.setText("O E 0.5 G 0.5 A");
	 thisExpression expression=null;
	 try{
		 while(context.getText().length()>0){
		 String str=context.getText().substring(0,1);
		 switch(str){
		 case "O":
				 expression=new Scale();
				 break;
		 case "D":
		 case "C":
		 case "E":
		 case "F":
		 case "G":
		 case "A": 
		 case "B":
		 case "P":
			 expression=new Note();
				 break;
		 }
		 expression.Interpret(context);
		 }
	 }catch(Exception e){
		 e.printStackTrace();
	 }
 }
}
