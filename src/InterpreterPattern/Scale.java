package InterpreterPattern;

public class Scale extends thisExpression {

	@Override
	public void excute(String key, double value) {
		// TODO Auto-generated method stub
		String scale="";
		int temp=(int) value;
		switch(temp){
		case 1:
			scale="high";
			break;
		case 2:
			scale="alto";
			break;
		case 3:
			scale="bass";
			break;
		}
		System.out.println(scale+" ");
	}

}
