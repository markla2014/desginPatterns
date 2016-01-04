package CommandPattern;

public class BakeChickenWingCommand extends Command {

	public BakeChickenWingCommand(Barbecuuer receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExceutedCommand() {
		// TODO Auto-generated method stub
		receiver.BakeChieckednWing();
	}

}
