package StatePattern;

public class RestState extends State {

	@Override
	public void WriteProgram(Work k) {
	System.out.println("current time "+k.getHour()+" get off work, go home");

	}

}
