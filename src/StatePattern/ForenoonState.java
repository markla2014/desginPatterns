package StatePattern;

public class ForenoonState extends State{

	@Override
	public void WriteProgram(Work k) {
	  if(k.getHour()<12){
		  System.out.println("当前时间： "+k.getHour()+"工作时间，精神百倍");
	  }else{
		  k.setState(new AfternoonState());
		  k.WriteProgram();
	  }
		
	}

}
