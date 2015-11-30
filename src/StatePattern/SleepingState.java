package StatePattern;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work k) {
      System.out.println("current time: "+k.getHour()+" sleeping");

	}

}
