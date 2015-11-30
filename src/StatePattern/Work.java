package StatePattern;

public class Work {
 private int Hour;
 private State state;
 private boolean finish=false;

public Work(){
 state=new ForenoonState();// need to set up a initial time 
}
public boolean isFinish() {
	return finish;
}

public void setFinish(boolean finish) {
	this.finish = finish;
}

public State getState() {
	return state;
}

public void setState(State state) {
	this.state = state;
}

public int getHour() {
	return Hour;
}

public void setHour(int hour) {
	Hour = hour;
}

public void WriteProgram() {
  state.WriteProgram(this);
	
}
}
