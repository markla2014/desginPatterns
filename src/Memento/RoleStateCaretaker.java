package Memento;

public class RoleStateCaretaker {
 public RoleStateMemento getMemento() {
		return memento;
	}

	public void setMemento(RoleStateMemento memento) {
		this.memento = memento;
	}

private RoleStateMemento memento;
 
}
