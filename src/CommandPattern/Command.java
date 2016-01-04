package CommandPattern;

public abstract class Command {

	protected Barbecuuer receiver;
	public Command(Barbecuuer receiver){
		this.receiver=receiver;
	}
	public abstract void ExceutedCommand();
}
