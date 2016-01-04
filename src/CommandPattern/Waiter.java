package CommandPattern;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Waiter {
	private List<Command> orders = new LinkedList<Command>();

	public void SetOrder(Command command) {
		if (command.toString() == "ÃüÁîÄ£Ê½¡£BakeChickenWingCommand") {
			System.out.println("no chinckedn");
		}else{
			orders.add(command);
			System.out.println("add bills: "+command.toString()+ " date"+ new Date().getTime());
			
		}

	}
	public void CancleOrder(Command command){
		orders.remove(command);
		System.out.println("cancle bill"+command.toString()+" date: "+new Date().getTime());
	}

	public void Notify() {
	orders.forEach(cmd->cmd.ExceutedCommand());
	}
}
