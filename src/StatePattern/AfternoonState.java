package StatePattern;

public class AfternoonState extends State{

	@Override
	public void WriteProgram(Work k) {
		if(k.getHour()<17){
			System.out.println("current time: "+k.getHour()+" state is not bad working hard");
		}else{
			k.setState(new EvingState());
		}
		
	}

}
