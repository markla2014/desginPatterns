package StatePattern;

public class EvingState extends State {

	@Override
	public void WriteProgram(Work k) {
		if(k.isFinish()){
			k.setState(new RestState());
			k.WriteProgram();
		}else{
			if(k.getHour()<21){
				System.out.println("current time: "+k.getHour()+" work hard");
			}else{
				k.setState(new SleepingState());
				k.WriteProgram();
			}
		}

	}

}
