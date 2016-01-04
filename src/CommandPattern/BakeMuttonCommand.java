package CommandPattern;

public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExceutedCommand() {
		// TODO Auto-generated method stub
		receiver.BakeMutton();
	}

}
