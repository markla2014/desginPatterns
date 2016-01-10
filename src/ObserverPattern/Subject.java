package ObserverPattern;

public interface Subject {

	public void Attach(Observer observer);
	public void Detach(Observer observer);
	public void Notify();
	public String getAction();
	public void setAction(String action);
}
