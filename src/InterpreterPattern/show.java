package InterpreterPattern;
/**
 * ������ģʽ�� ��һ�����ԣ����������ķ���һ�ֱ�ʾ������һ�������������������ʹ�øñ�ʾ�����������еľ���
 * ���һ���ض������͵����ⷢ����Ƶ���㹻�ߣ���ô���ܾ�ֵ�ý�����ĸ���ʵ������Ϊһ���򵥵ľ��ӡ������Ϳ��Թ���һ�����������ý�����ͨ������������������������
 * �����׸ı����չ�ķ�����Ϊ��ģʽʹ�����ʾ�ķ��������ʹ�ü̳иı����չ���ķ���Ҳ����ʵ���ķ�����Ϊ��������﷨���ָ����ڵ���۵�ʵ�ִ������ƣ���Щ�඼����ֱ�ӱ�д
 * ���㣺
 * ������ģʽΪ�ķ��е�ÿһ���������ٶ�����һ���࣬��˰�����������ķ��������Թ����ά�������鵱�ķ��ǳ�����ʱ��ʹ�������ļ������Է�������������������������
 * @author markla
 *
 */
public class show {
 public static void main(String[] args ){
	 
	 PlayContext context=new PlayContext();
	 System.out.println("�Ϻ�̲�� ");
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
