package StatePattern;

public class ForenoonState extends State{

	@Override
	public void WriteProgram(Work k) {
	  if(k.getHour()<12){
		  System.out.println("��ǰʱ�䣺 "+k.getHour()+"����ʱ�䣬����ٱ�");
	  }else{
		  k.setState(new AfternoonState());
		  k.WriteProgram();
	  }
		
	}

}
